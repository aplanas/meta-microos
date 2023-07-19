SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230716"

RPM_NAME = "openSUSE-release-appliance-wsl-20230716-1738.1.aarch64.rpm"
RPM_HASH = "b9966580e7ae6d35aa8b916c189c5ab71c6408d2c5f9e844beec6f98dab3bae5b688d38da0f876834b96dec943a89013ae00d9078e0bebbe68309be55de68ffb"

RPROVIDES:${PN} += "flavor-appliance-wsl \
openSUSE-release-appliance-wsl \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
