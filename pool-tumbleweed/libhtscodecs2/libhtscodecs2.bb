SUMMARY = "C library for custom compression for CRAM and other formats"
DESCRIPTION = "htscodecs provides an API to access CRAM codecs used for 'EXTERNAL' block types. \
These consist of two variants of the rANS codec (8-bit and 16-bit renormalisation, \
with run-length encoding and bit-packing also supported in the latter), \
a dynamic arithmetic coder, and custom codecs for name/ID compression \
and quality score compression derived from fqzcomp."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "libhtscodecs2-1.5.0-1.1.aarch64.rpm"
RPM_HASH = "41ca5ebb6482e1f5c2220140faa9e8850c533c3308b6c3cf551b5607a31eff5f568824e3bde591e561d7de78de8c7ba3aa126c045cc55328c22ede0484a2bc85"

RPROVIDES:${PN} += "libhtscodecs.so.2()(64bit) \
libhtscodecs2 \
libhtscodecs2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
