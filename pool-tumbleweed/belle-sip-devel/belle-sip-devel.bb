SUMMARY = "Headers and libraries for the belle-sip library"
DESCRIPTION = "Belle-sip is a SIP (RFC3261) implementation written in C, with an \
object-oriented API. \
 \
This package contains header files and development libraries needed \
to develop applications using the belle-sip library."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.49"

RPM_NAME = "belle-sip-devel-5.2.49-1.1.aarch64.rpm"
RPM_HASH = "582ed58442aab964fd586c90423792b8bf70856393671a55eb464e68b254627dacb589e8361cc1b663ce9d2dfe07fd18e0bff159850b9e30cb6542ea1b81125c"

RPROVIDES:${PN} += "belle-sip-devel \
belle-sip-devel(aarch-64) \
cmake(BelleSIP) \
pkgconfig(belle-sip)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
libbctoolbox-tester.so.1()(64bit) \
libbctoolbox.so.1()(64bit) \
libbellesip.so.1()(64bit) \
libbellesip1 \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
pkgconfig(bctoolbox) \
pkgconfig(zlib)"

inherit rpm
