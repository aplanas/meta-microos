SUMMARY = "Open vSwitch VTEP emulator"
DESCRIPTION = "A VTEP (VXLAN Tunnel EndPoint) emulator that uses Open vSwitch for \
forwarding. \
 \
Open vSwitch is a full-featured software-based Ethernet switch."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-vtep-3.1.0-14.1.aarch64.rpm"
RPM_HASH = "02975ed2c29025d8c9e6f41a4c8cce14a4d415307ca91a1eeb49a9104eff42208d26b5f207ea86088f3103104ccbfa5cbec76a5d179dd0b5433121814650ac65"

RPROVIDES:${PN} += "openvswitch-dpdk-vtep \
openvswitch-vtep \
openvswitch-vtep(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libopenvswitch-3.1.so.0()(64bit) \
libopenvswitch-3.1.so.0(libopenvswitch_0)(64bit) \
libvtep-3.1.so.0()(64bit) \
libvtep-3.1.so.0(libvtep_0)(64bit) \
openvswitch \
openvswitch-switch \
python3-ovs"

inherit rpm
