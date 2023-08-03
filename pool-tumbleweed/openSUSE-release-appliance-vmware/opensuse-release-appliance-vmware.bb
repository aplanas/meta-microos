SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230801"

RPM_NAME = "openSUSE-release-appliance-vmware-20230801-1756.1.aarch64.rpm"
RPM_HASH = "14e22a30ba16ae8618e443a6d14836cd58a59ec1ab8eff52bbc28caf3b6c41099455d1efde87e9e99abef8daf0867234deafb877503516e4d6d237f78d507246"

RPROVIDES:${PN} += "flavor-appliance-vmware \
openSUSE-release-appliance-vmware \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
