SUMMARY = "Open vSwitch core libraries"
DESCRIPTION = "Contains the shared libraries used by Open vSwitch and any eventual extensions."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "libopenvswitch-3_1-0-3.1.0-14.3.aarch64.rpm"
RPM_HASH = "7d84f468d856d14d5cbc169401f9d0224f58301b79f0087c081e9fd6bb20871107b636d64812747394401a98b8218de1754f289d7b2ec2f9fe7e7baa39941a54"

RPROVIDES:${PN} += "libofproto-3.1.so.0 \
libopenvswitch-3-1-0 \
libopenvswitch-3.1.so.0 \
libovsdb-3.1.so.0 \
libsflow-3.1.so.0 \
libvtep-3.1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
dpdk \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libcrypto.so.3 \
libdpdk-23 \
libm.so.6 \
librte-eal.so.23 \
librte-ethdev.so.23 \
librte-mbuf.so.23 \
librte-mempool.so.23 \
librte-meter.so.23 \
librte-vhost.so.23 \
libssl.so.3 \
libunbound.so.8"

inherit rpm
