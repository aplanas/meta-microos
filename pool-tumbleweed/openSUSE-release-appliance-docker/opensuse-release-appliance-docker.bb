SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230910"

RPM_NAME = "openSUSE-release-appliance-docker-20230910-1810.1.aarch64.rpm"
RPM_HASH = "5d31e3bb2f2dd5e174c79a0d32ed776b01d52f2c43e04477d4921c4fe0269c254762fe374250b2609892ebe526fdafe215e7aacbd3d7b40bac21605f583997cd"

RPROVIDES:${PN} += "flavor-appliance-docker \
openSUSE-release-appliance-docker \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
