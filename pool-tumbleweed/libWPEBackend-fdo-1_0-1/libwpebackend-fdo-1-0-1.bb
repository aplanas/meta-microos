SUMMARY = "Shared library for wpebackend-fdo"
DESCRIPTION = "A WPE backend designed for Linux desktop systems. \
 \
This package contains the shared library."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "libWPEBackend-fdo-1_0-1-1.14.0-1.2.aarch64.rpm"
RPM_HASH = "a53005aae947ee3cb8d4618bfae5392bca3d7dcc3ecac1c6d62e5d59d7dc9a6a648471ee13017161c874e4da98e37215c658dd6bf39708012383a6547b2fd5f6"

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
