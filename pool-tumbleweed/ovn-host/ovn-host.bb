SUMMARY = "Open Virtual Network support for Open vSwitch"
DESCRIPTION = "This subpackage contains the OVN host controller."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-host-23.03.0-14.3.aarch64.rpm"
RPM_HASH = "66254cfe5f31a07560fc6b5295260f3a35f332c57bb646d262a00bdf12d1742e23f64d26137fe2ade0c5fc944d3c61d686c5206ef94feebde986876c2473edf9"

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
