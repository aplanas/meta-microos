SUMMARY = "Open vSwitch VTEP emulator"
DESCRIPTION = "A VTEP (VXLAN Tunnel EndPoint) emulator that uses Open vSwitch for \
forwarding. \
 \
Open vSwitch is a full-featured software-based Ethernet switch."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-vtep-3.1.0-14.3.aarch64.rpm"
RPM_HASH = "ffe9264b6703c4fba6f5cac497cc0720e0ed51fd78ffb0082d02ae2a64f3c8857155fc2d3e5a20b34d25cfa8d3d7570a143e437639859c5cb7215bca9c246233"

RPROVIDES:${PN} += "openvswitch-dpdk-vtep \
openvswitch-vtep"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenvswitch-3.1.so.0 \
libvtep-3.1.so.0 \
openvswitch \
openvswitch-switch \
python3-ovs"

inherit rpm
