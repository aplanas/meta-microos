SUMMARY = "Development platform for in-memory data - shared library"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the shared library for the Acero streaming execution engine"
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "12.0.0"

RPM_NAME = "libarrow_acero1200-12.0.0-1.1.aarch64.rpm"
RPM_HASH = "c0525026b48cd57a2c4634082721cc358c812ba951494fc97395416b43d38b15fdc8590f7a7d8f267cf7fd96f720d137af612ff60f3af6485fab7385b9d1f272"

RPROVIDES:${PN} += "libarrow-acero.so.1200 \
libarrow-acero1200"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarrow.so.1200 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
