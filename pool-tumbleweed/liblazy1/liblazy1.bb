SUMMARY = "Liblazy - D-Bus methods provided for convenience"
DESCRIPTION = "Liblazy is a simple and easy to use library that provides convenient \
functions for sending messages over the D-Bus daemon, querying \
information from HAL or asking PolicyKit for a privilege."
LICENSE = "LGPL-2.1+"

PV = "0.2"

RPM_NAME = "liblazy1-0.2-1.25.aarch64.rpm"
RPM_HASH = "f562ddaaa652cc1fca3df86906b1ad08d49ea6882554a9f02e6102c2662aa426b8551c30db47774ee1e6618d0eae7eddf7b774b2526a039d5d7bbdc9cfae36b9"

RPROVIDES:${PN} += "liblazy.so.1()(64bit) \
liblazy1 \
liblazy1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit)"

inherit rpm
