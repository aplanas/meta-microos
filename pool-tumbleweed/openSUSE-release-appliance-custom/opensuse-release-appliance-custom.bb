SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230802"

RPM_NAME = "openSUSE-release-appliance-custom-20230802-1758.1.aarch64.rpm"
RPM_HASH = "6c6d7f0b8d53ea70d59b8a844f74d6dc53183cffea827b0f3634de5fc8e0bd6e070347a8c37aa68d9897ac08249eb5ce84da4fe21df926744053c5c216ee4eca"

RPROVIDES:${PN} += "flavor-appliance-custom \
openSUSE-release-appliance-custom \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
