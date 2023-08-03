SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230801"

RPM_NAME = "openSUSE-release-appliance-custom-20230801-1756.1.aarch64.rpm"
RPM_HASH = "c4a3335aad797e11396411e8347669cf91e645795198fd432a2856962cdff9469a1a2b5cad02166924e806ae37a6932fe5f9dcfb78f0e333113f81723a0b1f3e"

RPROVIDES:${PN} += "flavor-appliance-custom \
openSUSE-release-appliance-custom \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
