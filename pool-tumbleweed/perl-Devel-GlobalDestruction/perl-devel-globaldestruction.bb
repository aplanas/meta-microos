SUMMARY = "Provides function returning the equivalent of"
DESCRIPTION = "Perl's global destruction is a little tricky to deal with WRT finalizers \
because it's not ordered and objects can sometimes disappear. \
 \
Writing defensive destructors is hard and annoying, and usually if global \
destruction is happening you only need the destructors that free up non \
process local resources to actually execute. \
 \
For these constructors you can avoid the mess by simply bailing out if \
global destruction is in effect."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.14"

RPM_NAME = "perl-Devel-GlobalDestruction-0.14-1.23.noarch.rpm"
RPM_HASH = "8d51d31adb6015705e59b27256cc9e1bdf6496269c29b62671cedb31d6d32c1b63979ca30206ee526745f69edde6c804fdeffddbb47b6491a5950e54b366f87d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Devel::GlobalDestruction) \
perl-Devel-GlobalDestruction"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Sub::Exporter::Progressive)"

inherit rpm
