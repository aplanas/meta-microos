SUMMARY = "A wrapper for DNS name resolving or DNS faking"
DESCRIPTION = "resolv_wrapper makes it possible to contact your own DNS \
implmentation in your test environment. It requires socket_wrapper to be able \
to contact it. If it does not work on a special platform, the wrapper is able to \
fake DNS queries and return valid responses to your application. \
 \
This package does not have a devel package, because this project is for \
development/testing."
LICENSE = "BSD-3-Clause"

PV = "1.1.8"

RPM_NAME = "resolv_wrapper-1.1.8-2.2.aarch64.rpm"
RPM_HASH = "5c9c613638fac7d6c3ba60dccfcc099f826dede6f59243cecc221f8c33f8ab6ed5247ed0c6e8242f9ff832f1491d6ebf57ee2d0f84bfbb60e71e173a6a5b510b"

RPROVIDES:${PN} += "cmake(resolv_wrapper) \
libresolv_wrapper.so.0()(64bit) \
pkgconfig(resolv_wrapper) \
resolv_wrapper \
resolv_wrapper(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
cmake \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
pkgconf-pkg-config"

inherit rpm
