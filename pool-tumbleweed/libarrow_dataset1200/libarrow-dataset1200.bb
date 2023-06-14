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

PV = "12.0.0"

RPM_NAME = "libarrow_dataset1200-12.0.0-1.1.aarch64.rpm"
RPM_HASH = "a4a94ac19437337b859678eb6b184c1405126e93baa615bab1860ed776a994ca55bfd2c4ce6f64cc7fb3e48a7e0789fb9022b0160aac623b8048e176dfda1312"

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
