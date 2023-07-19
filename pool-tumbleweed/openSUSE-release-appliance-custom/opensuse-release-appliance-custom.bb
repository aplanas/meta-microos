SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230716"

RPM_NAME = "openSUSE-release-appliance-custom-20230716-1738.1.aarch64.rpm"
RPM_HASH = "3a386c76047c808d2c95f0c750a4c22ccf124558c74957eb9ce1a47c21ec61319c8616ac4380db21dcb327c7dc206899412633503ebf8fe9c8dc4883755e6f09"

RPROVIDES:${PN} += "flavor-appliance-custom \
openSUSE-release-appliance-custom \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
