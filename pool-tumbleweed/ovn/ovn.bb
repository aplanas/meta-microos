SUMMARY = "Open Virtual Network diagnostic utilities"
DESCRIPTION = "OVN, the Open Virtual Network, is a system to support virtual network \
abstraction.  OVN complements the existing capabilities of OVS to add \
native support for virtual network abstractions, such as virtual L2 and L3 \
overlays and security groups."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-23.03.0-15.1.aarch64.rpm"
RPM_HASH = "965b363797df9e6ddc4114b226f23d6ab6bf83c47b9a49f00be5a5a0d4d0ba498c92b846ebf90f3bd909f5018ac493fc490d675ec87a86db756bd6dfec6b7802"

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
