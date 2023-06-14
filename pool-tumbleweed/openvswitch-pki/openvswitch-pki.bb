SUMMARY = "Open vSwitch public key infrastructure dependency package"
DESCRIPTION = "openvswitch-pki provides PKI (public key infrastructure) support for \
Open vSwitch switches and controllers, reducing the risk of \
man-in-the-middle attacks on the Open vSwitch network infrastructure. \
 \
Open vSwitch is a full-featured software-based Ethernet switch."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-pki-3.1.0-14.1.aarch64.rpm"
RPM_HASH = "b990ae14a885dfb61f23fc5b27c5df7d2b0e1d9c5bb0ca1fea06797d95ed4cbd328bf0b56a84ca623b3794c67c22bb17049e0134dea1c137bfa9f76336a9c24d"

RPROVIDES:${PN} += "openvswitch-dpdk-pki \
openvswitch-pki"

RDEPENDS:${PN} += "/bin/sh \
openssl-cli \
openvswitch"

inherit rpm
