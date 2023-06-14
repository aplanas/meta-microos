SUMMARY = "Boost::Coroutine runtime library"
DESCRIPTION = "This package contains the Boost Coroutine runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_coroutine1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "94a435bdc017afff027bb16ef0d8b2769db490e0d0526afe1ec0fff7779703b659609f5a20a2c00714c3576970399720d55e869ded805fff52b9985acd3f6695"

RPROVIDES:${PN} += "libboost-coroutine.so.1.82.0 \
libboost-coroutine1-82-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
ld-linux-aarch64.so.1 \
libboost-context.so.1.82.0 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
