SUMMARY = "Development platform for in-memory data - shared library"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the shared library for Dataset API support."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "12.0.1"

RPM_NAME = "libarrow_dataset1200-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "cad9e9223e02b4f902c8be31940110f818250c17fd2a44fa62db9fc63d89f1383c530aa063b9c2263af26c4233b29846675b500a8940d17ddf58f1d5a6f110a3"

RPROVIDES:${PN} += "libarrow-dataset.so.1200 \
libarrow-dataset1200"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarrow-acero.so.1200 \
libarrow.so.1200 \
libc.so.6 \
libgcc-s.so.1 \
libparquet.so.1200 \
libstdc++.so.6"

inherit rpm
