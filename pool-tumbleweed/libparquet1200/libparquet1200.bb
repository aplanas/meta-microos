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

PV = "12.0.0"

RPM_NAME = "libparquet1200-12.0.0-1.1.aarch64.rpm"
RPM_HASH = "88da005bb231603a4fcbed034c0319139c136c84db15fe2e683696609a09771ca8224d1d4ad0dd6c6c1546153a8197392087dea9888c4b425370f05345b1bdb5"

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
