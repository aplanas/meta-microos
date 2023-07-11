SUMMARY = "A multilayer virtual network switch"
DESCRIPTION = "Open vSwitch is a multilayer virtual network Ethernet switch. It is \
enables network automation through programmatic extension, and \
supports standard management interfaces and protocols (e.g. NetFlow, \
sFlow, RSPAN, ERSPAN, CLI, LACP, 802.1ag). In addition, it supports \
distribution across multiple physical servers similar to VMware’s \
vNetwork distributed vswitch or Cisco’s Nexus 1000V."
LICENSE = "Apache-2.0 & LGPL-2.1-only & SISSL"

PV = "3.1.0"

RPM_NAME = "openvswitch-3.1.0-14.3.aarch64.rpm"
RPM_HASH = "2a6939842237069e383ce9fd607811369f9143ccac3bd8171320c930b7f7c5ecacefd659e209651c6a056cfbf679dbdd7e6f79971daa8ff19019f542b35dcae9"

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
