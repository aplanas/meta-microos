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

RPM_NAME = "perl-Devel-GlobalDestruction-0.14-1.24.noarch.rpm"
RPM_HASH = "866f9a4b23b131d44270b631e8242bafdcc64a2415e98fa8f9adbde5aa1ef974b87268cef7edbef0f0cf99336c53232c0c49367abb406fc7d47af7077efbc8f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--GlobalDestruction \
perl-Devel-GlobalDestruction"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Sub--Exporter--Progressive"

inherit rpm
