SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230828"

RPM_NAME = "openSUSE-release-appliance-custom-20230828-1789.1.aarch64.rpm"
RPM_HASH = "6ab59ee824c659c33d1f471aef91f0cde2f324da2b39c36df38761a964a04bd6aede5d3cd2c08b3f97d0953426dee47e1328141c2ac56f883683edc2f2353b30"

RPROVIDES:${PN} += "flavor-appliance-custom \
openSUSE-release-appliance-custom \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
