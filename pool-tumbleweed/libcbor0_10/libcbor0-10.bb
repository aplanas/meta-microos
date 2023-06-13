SUMMARY = "Library for parsing Concise Binary Object Representation (CBOR)"
DESCRIPTION = "libcbor is a C99 library for parsing and generating CBOR (RFC 7049), \
a general-purpose schema-less binary data format. \
 \
It supports flexible memory management, UTF-8, streams & incremental \
processing, and has a layered architecture."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "libcbor0_10-0.10.2-1.2.aarch64.rpm"
RPM_HASH = "b6cfc8c045199a5cff937935dea69d9a0a5ae8b99c138d371484bdbad5639d95933d9b419e40aaf42f441f0c6b43e9d3c40565e7ccf26e13e042e024f6e41889"

RPROVIDES:${PN} += "libcbor.so.0.10()(64bit) \
libcbor0_10 \
libcbor0_10(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
