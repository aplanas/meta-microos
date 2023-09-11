SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230904"

RPM_NAME = "openSUSE-release-appliance-vmware-20230904-1803.1.aarch64.rpm"
RPM_HASH = "16bcabbbdf3c16a6c79100d29c192600b6fe58caabc160226daa7c02a6a3f16b8454e95f8015bcf3eb4c95332cfddf5d429cb30f55dddf761db0c01fae342aa0"

RPROVIDES:${PN} += "flavor-appliance-vmware \
openSUSE-release-appliance-vmware \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
