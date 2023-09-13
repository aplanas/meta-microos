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

PV = "13.0.0"

RPM_NAME = "libparquet1300-13.0.0-1.1.aarch64.rpm"
RPM_HASH = "b53e8ca992ab4c9fc934ce23ad4438318dd3238f42a8874bd01bc00239d4649f5cc2d42ddad4e38d7c2046177de515b670382c04c57261a6e26a15713af29e7c"

RPROVIDES:${PN} += "libparquet.so.1300 \
libparquet1300"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarrow.so.1300 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libthrift-0.17.0.so"

inherit rpm
