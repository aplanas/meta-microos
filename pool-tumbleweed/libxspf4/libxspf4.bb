SUMMARY = "Provides XSPF playlist reading and writing support"
DESCRIPTION = "libxspf brings XSPF playlist reading and writing support to your C++ \
application. Both version 0 and 1 are supported. libxspf uses Expat \
for XML parsing and CppTest for unit testing. libxspf is the official \
reference implementation for XSPF of the Xiph.Org Foundation. Features \
* Full conformance to the XSPF specification \
* Cross-platform (Unix, Windows, Mac OS X, ...) \
* Read and write XSPF files \
* XSPF-0 and XSPF-1 support \
* Unicode support \
* Full support for XSPF extensions \
* Full support for XML namespaces \
* Fast (XML parsing is done by Expat) \
* Uses unit testing \
* Liberal license: New BSD license"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.2.1"

RPM_NAME = "libxspf4-1.2.1-1.7.aarch64.rpm"
RPM_HASH = "b13350c57260a7451affc27d003f616215046981ae9d3122c83152862466b319b20bb71b2ae41d3fc4ff24dfe46545191f83e30bc25eaf31db074c9744b31353"

RPROVIDES:${PN} += "libxspf.so.4 \
libxspf4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
liburiparser.so.1"

inherit rpm
