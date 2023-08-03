SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230801"

RPM_NAME = "openSUSE-release-appliance-wsl-20230801-1756.1.aarch64.rpm"
RPM_HASH = "5d4fc0421e9d13f4728c04146406f05e2cf14087b38d57fe3d747ad6a14052ecdb015933184fab8cf7f8bab074e8f6093204159b6818b5bfe18dfb89aea85294"

RPROVIDES:${PN} += "flavor-appliance-wsl \
openSUSE-release-appliance-wsl \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
