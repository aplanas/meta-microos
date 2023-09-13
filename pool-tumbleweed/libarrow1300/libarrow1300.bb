SUMMARY = "Development platform for in-memory data - shared library"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the shared library for Apache Arrow."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "13.0.0"

RPM_NAME = "libarrow1300-13.0.0-1.1.aarch64.rpm"
RPM_HASH = "1776bda0810ce2c59595a50042e08cda2d2165ffbee03ad5c5edd39b1eeb66d95dd6da1827cd0ea20c0cd9620f51a9d8ed7a7f43b7c0dd22be9aae6acffbf5ae"

RPROVIDES:${PN} += "libarrow.so.1300 \
libarrow1300"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglog.so.0 \
liblz4.so.1 \
libm.so.6 \
libre2.so.11 \
libsnappy.so.1 \
libstdc++.so.6 \
libutf8proc.so.2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
