SUMMARY = "Development files for Open vSwitch"
DESCRIPTION = "Devel libraries and headers for Open vSwitch."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-devel-3.1.0-14.3.aarch64.rpm"
RPM_HASH = "f69fbf1ccbb37f41d91de07be8d820f6e6c68a8af2c9a4d4d4557322ddfe86153d3286d17c14b3fff5c39bccf3bf8aa3b6d0ab68aae3efb41be025b5e41aca77"

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
