SUMMARY = "Open vSwitch VTEP emulator"
DESCRIPTION = "A VTEP (VXLAN Tunnel EndPoint) emulator that uses Open vSwitch for \
forwarding. \
 \
Open vSwitch is a full-featured software-based Ethernet switch."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-vtep-3.1.0-15.1.aarch64.rpm"
RPM_HASH = "0751f6203458c7df8055b4e8aef78c4c9ce172ef4bd172a0fb6d70535c93da688f88bd2488d8327e91e146919de10b897c3149bcf08bea0599234207fcc152f8"

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
