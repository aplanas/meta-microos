SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230904"

RPM_NAME = "openSUSE-release-appliance-docker-20230904-1803.1.aarch64.rpm"
RPM_HASH = "41b7bbbfd593175c4a33839c414b54c9ff8bc23a854f68029c833237d64dc5a109a1bec114ab17e43aac640246ae00982efc5b034cd39a6ed97f801802c14bc9"

RPROVIDES:${PN} += "flavor-appliance-docker \
openSUSE-release-appliance-docker \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
