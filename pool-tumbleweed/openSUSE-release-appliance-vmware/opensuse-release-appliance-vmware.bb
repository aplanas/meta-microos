SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230828"

RPM_NAME = "openSUSE-release-appliance-vmware-20230828-1789.1.aarch64.rpm"
RPM_HASH = "ac2b7f3ce3c5e1ee0bc6839bcfc0c025d54359bf4b025bb1f320b84334186e23a2d0fc50147fcfe404ee84da03cad804f9f357dc70e4bfcd9082595b56a101be"

RPROVIDES:${PN} += "flavor-appliance-vmware \
openSUSE-release-appliance-vmware \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
