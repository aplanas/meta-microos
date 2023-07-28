SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230719"

RPM_NAME = "openSUSE-release-appliance-wsl-20230719-1742.1.aarch64.rpm"
RPM_HASH = "688d9b6e2ce344b9583925f093932eb9b79ea0d82d520e95e93d990c449dc314c8e996d886a1e7a56df69ffa9165d740babed7da5ae72feafa52210f97cdcc03"

RPROVIDES:${PN} += "flavor-appliance-wsl \
openSUSE-release-appliance-wsl \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
