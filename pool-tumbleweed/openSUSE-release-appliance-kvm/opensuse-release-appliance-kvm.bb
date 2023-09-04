SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230828"

RPM_NAME = "openSUSE-release-appliance-kvm-20230828-1789.1.aarch64.rpm"
RPM_HASH = "8d63a543c495ba8c2d5ac28a90785661e0032725b2108cfaccf41c3e04b413c4bf4847aeb21b62812b16c05f3bbaea94e3fdf0646786b541063abdba14754e53"

RPROVIDES:${PN} += "flavor-appliance-kvm \
openSUSE-release-appliance-kvm \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
