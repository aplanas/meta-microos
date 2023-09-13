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

PV = "13.0.0"

RPM_NAME = "libarrow_acero1300-13.0.0-1.1.aarch64.rpm"
RPM_HASH = "de153d171f18356f7af46bb81ecbb1bf15c3342312626686340172f8d341373539104303450fd00a4def94122fb87c579eb2039854ac1c81074deb4f9e2b5819"

RPROVIDES:${PN} += "libarrow-acero.so.1300 \
libarrow-acero1300"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarrow.so.1300 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
