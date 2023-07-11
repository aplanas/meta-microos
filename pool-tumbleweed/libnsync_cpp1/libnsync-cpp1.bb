SUMMARY = "Library that exports various synchronization primitives"
DESCRIPTION = "Library for C++ that exports various synchronization primitives"
LICENSE = "Apache-2.0"

PV = "1.23.0"

RPM_NAME = "libnsync_cpp1-1.23.0-2.13.aarch64.rpm"
RPM_HASH = "1f0a52201915db93910d36f47bdcd53ad32c6aa51e6bb937861bdf8244e788654fee3758903bda12c8708a83bc896dd130d56ea5cf7a91c72fee87dc9e0f4216"

RPROVIDES:${PN} += "libnsync-cpp.so.1 \
libnsync-cpp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libstdc++.so.6"

inherit rpm
