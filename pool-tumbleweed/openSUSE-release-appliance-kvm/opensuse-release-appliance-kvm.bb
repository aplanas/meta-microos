SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230712"

RPM_NAME = "openSUSE-release-appliance-kvm-20230712-1733.1.aarch64.rpm"
RPM_HASH = "e4784edead33614f6d71868f58b1c6306a2dd68fa3810a93bd9e28370594250cba36f89c569dc7cdb6cf0aac81c2b4c5bb1bc11d4e8150316734fc7f15208bd3"

RPROVIDES:${PN} += "flavor-appliance-kvm \
openSUSE-release-appliance-kvm \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
