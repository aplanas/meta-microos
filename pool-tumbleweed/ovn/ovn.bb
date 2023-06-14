SUMMARY = "Open Virtual Network diagnostic utilities"
DESCRIPTION = "OVN, the Open Virtual Network, is a system to support virtual network \
abstraction.  OVN complements the existing capabilities of OVS to add \
native support for virtual network abstractions, such as virtual L2 and L3 \
overlays and security groups."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-23.03.0-14.1.aarch64.rpm"
RPM_HASH = "3c280919c028077e772dd29c69da2c3e891ddefb6713b01ab2a5213bb7bd41571c689cfd3328bef329c6c2c9744da2b89a6810a39330a42297b3f44a11dd7295"

RPROVIDES:${PN} += "config-ovn \
openvswitch-dpdk-ovn \
openvswitch-ovn \
openvswitch-ovn-common \
ovn"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenvswitch-3.1.so.0 \
libovn-23.03.so.0 \
openvswitch"

inherit rpm
