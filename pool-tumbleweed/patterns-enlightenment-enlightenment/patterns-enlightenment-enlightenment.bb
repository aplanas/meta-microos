SUMMARY = "Enlightenment"
DESCRIPTION = "Enlightenment Window Manager and applications"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-enlightenment-enlightenment-20170319-2.16.aarch64.rpm"
RPM_HASH = "5a871781ce90a1c0781b1205df1d91f4de7ef611a644e5707f08eb94a2ddacb4a209173efb6b4073e5184f1ebbc49c733bfcca15d92acc405b42a58da122195c"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-enlightenment-enlightenment \
patterns-enlightenment-enlightenment(aarch-64)"

RDEPENDS:${PN} += "enlightenment \
lightdm \
pattern()"

inherit rpm
