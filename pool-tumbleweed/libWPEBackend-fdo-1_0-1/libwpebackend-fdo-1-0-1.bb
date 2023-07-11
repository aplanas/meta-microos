SUMMARY = "Shared library for wpebackend-fdo"
DESCRIPTION = "A WPE backend designed for Linux desktop systems. \
 \
This package contains the shared library."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "libWPEBackend-fdo-1_0-1-1.14.0-1.3.aarch64.rpm"
RPM_HASH = "3433fbc5a012efe40ba0d43614288a72fc7d7e607628a228f6b34d6bd64f8354dd24bd9fdb216586100a138fa76a5e48201a4f5b1e35c10097219e7430ddd560"

RPROVIDES:${PN} += "libWPEBackend-fdo-1-0-1 \
libWPEBackend-fdo-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-egl.so.1 \
libwayland-server.so.0 \
libwpe-1.0.so.1"

inherit rpm
