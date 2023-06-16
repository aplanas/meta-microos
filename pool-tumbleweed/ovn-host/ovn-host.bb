SUMMARY = "Open Virtual Network support for Open vSwitch"
DESCRIPTION = "This subpackage contains the OVN host controller."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-host-23.03.0-14.1.aarch64.rpm"
RPM_HASH = "1d97d6919489af2d31ae888612167f22789fbd4c4631495aad4b9ef346276e1ea471511cbe10efc44bf6cfc668c8f21ae65d1c1d1abe21ec51be8384c931301d"

RPROVIDES:${PN} += "openvswitch-dpdk-ovn-/usr/bin/ovn-controller \
openvswitch-ovn-/usr/bin/ovn-controller \
openvswitch-ovn-host \
ovn-host"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenvswitch-3.1.so.0 \
libovn-23.03.so.0 \
openvswitch \
ovn"

inherit rpm
