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

PV = "13.0.0"

RPM_NAME = "libarrow_dataset1300-13.0.0-1.1.aarch64.rpm"
RPM_HASH = "c4cee55f60deb2ab3890242f7bffa57c71782765e93fc5aee28c93eb987d7b7a37fd79bc86f189ddc0ccc94e5958b93b647e490a5afb5d091476dd99c3403a15"

RPROVIDES:${PN} += "libarrow-dataset.so.1300 \
libarrow-dataset1300"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarrow-acero.so.1300 \
libarrow.so.1300 \
libc.so.6 \
libgcc-s.so.1 \
libparquet.so.1300 \
libstdc++.so.6"

inherit rpm
