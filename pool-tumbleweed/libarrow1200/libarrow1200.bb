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

PV = "12.0.0"

RPM_NAME = "libarrow1200-12.0.0-1.1.aarch64.rpm"
RPM_HASH = "8782bda917132721cb6bb70a22e133197269ad9c5fe50a0e303eac1f61af011f87a874d5ab8e389821a0c928853c9a34adc4f9d46ea31b22db1f9945c1cc4e02"

RPROVIDES:${PN} += "libarrow.so.1200()(64bit) \
libarrow1200 \
libarrow1200(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbrotlidec.so.1()(64bit) \
libbrotlienc.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglog.so.0()(64bit) \
liblz4.so.1()(64bit) \
libm.so.6()(64bit) \
libre2.so.10()(64bit) \
libsnappy.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libutf8proc.so.2()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
