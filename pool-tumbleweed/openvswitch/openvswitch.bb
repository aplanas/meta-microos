SUMMARY = "A multilayer virtual network switch"
DESCRIPTION = "Open vSwitch is a multilayer virtual network Ethernet switch. It is \
enables network automation through programmatic extension, and \
supports standard management interfaces and protocols (e.g. NetFlow, \
sFlow, RSPAN, ERSPAN, CLI, LACP, 802.1ag). In addition, it supports \
distribution across multiple physical servers similar to VMware’s \
vNetwork distributed vswitch or Cisco’s Nexus 1000V."
LICENSE = "Apache-2.0 & LGPL-2.1-only & SISSL"

PV = "3.1.0"

RPM_NAME = "openvswitch-3.1.0-15.1.aarch64.rpm"
RPM_HASH = "2a9bfa757edf7d29f75f2b88323e54e6baf3a1a75f849995b5ed31744f500429334d2d59544ee4e868a6f10f5afa17e9d98efebdb0ded314856c20b3246af119"

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
