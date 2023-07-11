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

PV = "12.0.1"

RPM_NAME = "libarrow1200-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "0009e319a904b51261803b9af4f11f19f5a67dac15865fff04909469888c64de2c796c92443b9ee3430489b76ed149c393c3b1d5ddca557234a1ac69f965f54b"

RPROVIDES:${PN} += "libarrow.so.1200 \
libarrow1200"

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
libre2.so.10 \
libsnappy.so.1 \
libstdc++.so.6 \
libutf8proc.so.2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
