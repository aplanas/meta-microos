SUMMARY = "Development files for Open vSwitch"
DESCRIPTION = "Devel libraries and headers for Open vSwitch."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-devel-3.1.0-15.1.aarch64.rpm"
RPM_HASH = "527f73674ba43c395b39353a6508dda71f8cc5e8b45f19af319ec6377c1a52636ec46203fcf77cd2a1aa795766e0a75250fe8ff7f346ff2cb4eed48bfb417174"

RPROVIDES:${PN} += "openvswitch-devel \
openvswitch-dpdk-devel \
pkgconfig-libofproto \
pkgconfig-libopenvswitch \
pkgconfig-libovsdb \
pkgconfig-libsflow"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
libopenvswitch-3-1-0 \
python3-ovs"

inherit rpm
