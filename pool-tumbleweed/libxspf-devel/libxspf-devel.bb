SUMMARY = "Brings XSPF playlist read and write support to C++ apps"
DESCRIPTION = "libxspf brings XSPF playlist reading and writing support to your C++ \
application. Both version 0 and 1 are supported. libxspf uses Expat \
for XML parsing and CppTest for unit testing. libxspf is the official \
reference implementation for XSPF of the Xiph.Org Foundation. Features \
 \
* Full conformance to the XSPF specification \
 \
* Cross-platform (Unix, Windows, Mac OS X, ...) \
 \
* Read and write XSPF files \
 \
* XSPF-0 and XSPF-1 support \
 \
* Unicode support \
 \
* Full support for XSPF extensions \
 \
* Full support for XML namespaces \
 \
* Fast (XML parsing is done by Expat) \
 \
* Uses unit testing \
 \
* Liberal license: New BSD license"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.2.1"

RPM_NAME = "libxspf-devel-1.2.1-1.7.aarch64.rpm"
RPM_HASH = "2ee80fa43f3a2e8fe76add6128683168edf6825c695908133fc7bb6b170276f74e73a32827d89a015c5c814ccac43c3d01720a5fa18d3566c0963f36850d4d6f"

RPROVIDES:${PN} += "libxspf-devel \
pkgconfig-xspf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat-devel \
libgcc-s.so.1 \
libstdc++-devel \
libstdc++.so.6 \
libxspf4"

inherit rpm
