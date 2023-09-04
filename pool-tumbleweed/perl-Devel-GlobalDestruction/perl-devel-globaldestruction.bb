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

RPM_NAME = "perl-Devel-GlobalDestruction-0.14-1.25.noarch.rpm"
RPM_HASH = "b91c0da9193910e25fb9bdecf30c4ce5f25a1689eb63a0d348ece49424c1ebc869a177b0f05177bd113c713edbe9ed121a0edb11e38875dc7636eed48f1825b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--GlobalDestruction \
perl-Devel-GlobalDestruction"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Sub--Exporter--Progressive"

inherit rpm
