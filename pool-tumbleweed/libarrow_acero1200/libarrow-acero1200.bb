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

PV = "12.0.1"

RPM_NAME = "libarrow_acero1200-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "d78f2f1098cbbbaca76f4051563cdeea7db6f0e6f2bb0d1846e95311109a9acb8faf7201ecacd8c6dbd01fe3007e36e465b761117a250dd95740c7f74589fd79"

RPROVIDES:${PN} += "libarrow-acero.so.1200 \
libarrow-acero1200"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarrow.so.1200 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
