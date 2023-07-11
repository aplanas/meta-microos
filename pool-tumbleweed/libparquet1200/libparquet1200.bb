SUMMARY = "Development platform for in-memory data - shared library"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the shared library for the Parquet format."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "12.0.1"

RPM_NAME = "libparquet1200-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "0efcfb7a4d0d256f21c5189c8315a02adab977520033a74650633624c71f53eb3131cc9e87cb7014b8777c64063f5e2e4087c0f11c5563f6ea0d6b973c8d4212"

RPROVIDES:${PN} += "libparquet.so.1200 \
libparquet1200"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarrow.so.1200 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libthrift-0.17.0.so"

inherit rpm
