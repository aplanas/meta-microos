SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230902"

RPM_NAME = "openSUSE-release-appliance-vmware-20230902-1800.1.aarch64.rpm"
RPM_HASH = "8174b00073482ec1091ad8a304e1de7e2137ce674f1327cb41ab2c21b56a6e573f94bcde48a0c8e2f1c4416790a90983346dc333d2c95d837406d81cf8e6ee54"

RPROVIDES:${PN} += "flavor-appliance-vmware \
openSUSE-release-appliance-vmware \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
