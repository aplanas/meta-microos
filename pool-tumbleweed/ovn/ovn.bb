SUMMARY = "Open Virtual Network diagnostic utilities"
DESCRIPTION = "OVN, the Open Virtual Network, is a system to support virtual network \
abstraction.  OVN complements the existing capabilities of OVS to add \
native support for virtual network abstractions, such as virtual L2 and L3 \
overlays and security groups."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-23.03.0-14.3.aarch64.rpm"
RPM_HASH = "71d360914d5c8c169e392ad5cba669e92c9930c76c6211ac6c7d43fcb98fffce1f6081815879dc8f1ac0f25347cf47dbaa76e207e31fadaef8d2f9f49747f6e7"

RPROVIDES:${PN} += "config-ovn \
openvswitch-dpdk-ovn \
openvswitch-ovn \
openvswitch-ovn-common \
ovn"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenvswitch-3.1.so.0 \
libovn-23.03.so.0 \
openvswitch"

inherit rpm
