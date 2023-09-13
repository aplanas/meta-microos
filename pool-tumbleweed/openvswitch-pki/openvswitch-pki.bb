SUMMARY = "Open vSwitch public key infrastructure dependency package"
DESCRIPTION = "openvswitch-pki provides PKI (public key infrastructure) support for \
Open vSwitch switches and controllers, reducing the risk of \
man-in-the-middle attacks on the Open vSwitch network infrastructure. \
 \
Open vSwitch is a full-featured software-based Ethernet switch."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-pki-3.1.0-15.1.aarch64.rpm"
RPM_HASH = "afe1e185900ab8fef52bab19a80501ec5c8ff77289762e0572604e939c7bc4ca9eb29eb86b7485c83ced0ad3ddbe4b070bdc7c9a2baaa4218703ab07033885e2"

RPROVIDES:${PN} += "openvswitch-dpdk-pki \
openvswitch-pki"

RDEPENDS:${PN} += "/usr/bin/sh \
openssl-cli \
openvswitch"

inherit rpm
