SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230801"

RPM_NAME = "openSUSE-release-appliance-hyperv-20230801-1756.1.aarch64.rpm"
RPM_HASH = "33af23d986b69d08b3437053ae8f06152d7fd8fc55b793ac71f55889296596d3d5e02994781feb89283b27502cdb93b4b5a9129cbdd905e58a208ca49fed996e"

RPROVIDES:${PN} += "flavor-appliance-hyperv \
openSUSE-release-appliance-hyperv \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
