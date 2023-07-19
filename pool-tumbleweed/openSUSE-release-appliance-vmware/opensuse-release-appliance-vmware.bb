SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230716"

RPM_NAME = "openSUSE-release-appliance-vmware-20230716-1738.1.aarch64.rpm"
RPM_HASH = "95ee42471ade4c20b5faf1ed28749110426864f6ce31fc61231e35aeb27b56c58e52c82e599a608ce385571a98ee411369a53f14263022d9208f75cd4bff773f"

RPROVIDES:${PN} += "flavor-appliance-vmware \
openSUSE-release-appliance-vmware \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
