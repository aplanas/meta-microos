SUMMARY = "Open vSwitch core libraries"
DESCRIPTION = "Contains the shared libraries used by Open vSwitch and any eventual extensions."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "libopenvswitch-3_1-0-3.1.0-15.1.aarch64.rpm"
RPM_HASH = "7036ee58cc92fdcb8ffe27012070af96dfc0c7e3dad0a095f405bc1c5da36d5a7d2c8f94881a100b57d44e22759eb5a9b1eed98c47f089b5b66a438758ff9b84"

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
