SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230910"

RPM_NAME = "openSUSE-release-appliance-wsl-20230910-1810.1.aarch64.rpm"
RPM_HASH = "fcb1cf990bd499fcd21fed2c526ce5f0b9a025747f920ec0fed126324c6eef36bd799263561d9e4ff851af42ca1aaf79d15127e35080c773383c1c12659391d1"

RPROVIDES:${PN} += "flavor-appliance-wsl \
openSUSE-release-appliance-wsl \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
