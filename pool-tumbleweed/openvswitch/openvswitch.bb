SUMMARY = "A multilayer virtual network switch"
DESCRIPTION = "Open vSwitch is a multilayer virtual network Ethernet switch. It is \
enables network automation through programmatic extension, and \
supports standard management interfaces and protocols (e.g. NetFlow, \
sFlow, RSPAN, ERSPAN, CLI, LACP, 802.1ag). In addition, it supports \
distribution across multiple physical servers similar to VMware’s \
vNetwork distributed vswitch or Cisco’s Nexus 1000V."
LICENSE = "Apache-2.0 & LGPL-2.1-only & SISSL"

PV = "3.1.0"

RPM_NAME = "openvswitch-3.1.0-14.1.aarch64.rpm"
RPM_HASH = "ba94c986a1bb57ba62af9ce2583d9ce165de826637ddcd6a018f71a30c9481e5e3843f6b495b4b1ec266658a9f3a6b41fd78db6643a7e0561db3292e9e0f9a12"

RPROVIDES:${PN} += "config-openvswitch \
openvswitch \
openvswitch-common \
openvswitch-controller \
openvswitch-dpdk \
openvswitch-dpdk-switch \
openvswitch-switch"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libofproto-3.1.so.0 \
libopenvswitch-3.1.so.0 \
libovsdb-3.1.so.0 \
modutils \
shadow \
util-linux"

inherit rpm
