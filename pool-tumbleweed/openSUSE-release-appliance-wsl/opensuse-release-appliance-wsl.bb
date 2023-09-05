SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230902"

RPM_NAME = "openSUSE-release-appliance-wsl-20230902-1800.1.aarch64.rpm"
RPM_HASH = "3bc35b30f85e9d34bcdd0d6930bf0a1140b27d2b68450621f898c8cfcc28d4d0d207c95a6a794e0d27698b04b288b9e388bed75efedc9a8d1444461bd681d28d"

RPROVIDES:${PN} += "flavor-appliance-wsl \
openSUSE-release-appliance-wsl \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
