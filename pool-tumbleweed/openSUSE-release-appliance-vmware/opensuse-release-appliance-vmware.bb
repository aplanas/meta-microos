SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230707"

RPM_NAME = "openSUSE-release-appliance-vmware-20230707-1726.1.aarch64.rpm"
RPM_HASH = "85551c25de1ed8865ac9bbb16248759d2a24910885dd8dc004e74bd0c2b7e0da952d8f1a0414903d67d5ab3e1134c9dde2c73bef141264dca167d1ad314c2a8f"

RPROVIDES:${PN} += "flavor-appliance-vmware \
openSUSE-release-appliance-vmware \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
