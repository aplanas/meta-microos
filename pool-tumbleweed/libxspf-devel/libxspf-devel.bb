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

RPM_NAME = "libxspf-devel-1.2.1-1.6.aarch64.rpm"
RPM_HASH = "da5a584dbec3f6827bcedbff3dc8d02afd97aeba4fc7e83f302b2325f7636820ecc11d6785c94028e0e55fae0e842227aa87726ee30fbf84eee24722cfddc591"

RPROVIDES:${PN} += "libxspf-devel \
libxspf-devel(aarch-64) \
pkgconfig(xspf)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexpat-devel \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++-devel \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libxspf4"

inherit rpm
