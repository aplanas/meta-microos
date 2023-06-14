SUMMARY = "Open vSwitch core libraries"
DESCRIPTION = "Contains the shared libraries used by Open vSwitch and any eventual extensions."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "libopenvswitch-3_1-0-3.1.0-14.1.aarch64.rpm"
RPM_HASH = "8387b7e8e3f3826be7284a0a4fcf68179b6f82bc1068fcd5529853182999f62933133ac21cc26c9ea15ecff3c439d76e4616e8c9fcf9c819891bb29e8472c7e5"

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
