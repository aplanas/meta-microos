SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230802"

RPM_NAME = "openSUSE-release-appliance-docker-20230802-1758.1.aarch64.rpm"
RPM_HASH = "0d2dce8af5de1e375d8562aadb439839f69615fcdbb12582662c9af3b3dfdb0b3dc7bc5243184d9f09b4ca7239d70c64c8c27fe4c1830ef9cd85cdb1336cbec4"

RPROVIDES:${PN} += "flavor-appliance-docker \
openSUSE-release-appliance-docker \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
