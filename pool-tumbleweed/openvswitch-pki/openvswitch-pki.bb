SUMMARY = "Open vSwitch public key infrastructure dependency package"
DESCRIPTION = "openvswitch-pki provides PKI (public key infrastructure) support for \
Open vSwitch switches and controllers, reducing the risk of \
man-in-the-middle attacks on the Open vSwitch network infrastructure. \
 \
Open vSwitch is a full-featured software-based Ethernet switch."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-pki-3.1.0-14.3.aarch64.rpm"
RPM_HASH = "24490038ee9be2b892db3eae5280b83e1a0e2e33798560ae60768c7ec3d8062bde1a0ad22b09ef0d9a7fe00d007dab586c0418b77fcd85632526542fd054d587"

RPROVIDES:${PN} += "openvswitch-dpdk-pki \
openvswitch-pki"

RDEPENDS:${PN} += "/usr/bin/sh \
openssl-cli \
openvswitch"

inherit rpm
