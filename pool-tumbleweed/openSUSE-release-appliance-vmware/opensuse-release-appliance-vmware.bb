SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230910"

RPM_NAME = "openSUSE-release-appliance-vmware-20230910-1810.1.aarch64.rpm"
RPM_HASH = "8b35171655c8bc3a72bf1853b8bbf11b0695fb0fb4c53a3ae1cf12727b8e95121c5ecc6822fb74ab7ce848ffba9b5be6f9e3da5b307f4f8771a2fc1a8d2149f2"

RPROVIDES:${PN} += "flavor-appliance-vmware \
openSUSE-release-appliance-vmware \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
