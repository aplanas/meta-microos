SUMMARY = "Lempel–Ziv–Markov chain algorithm compression library"
DESCRIPTION = "Library for encoding/decoding LZMA files."
LICENSE = "SUSE-Public-Domain"

PV = "5.4.3"

RPM_NAME = "liblzma5-5.4.3-1.3.aarch64.rpm"
RPM_HASH = "d5b53d67e2541c6d57a0a060a6e5e19458507f6ad77c03d882b23cfdb5fbf956a1f6b0551193d3f8ed7a6375871e6a0b98595fc64714ca16dece3518f246f5e0"

RPROVIDES:${PN} += "liblzma.so.5 \
liblzma5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
