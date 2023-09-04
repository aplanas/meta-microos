SUMMARY = "Shared library for wpebackend-fdo"
DESCRIPTION = "A WPE backend designed for Linux desktop systems. \
 \
This package contains the shared library."
LICENSE = "BSD-2-Clause"

PV = "1.14.2"

RPM_NAME = "libWPEBackend-fdo-1_0-1-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "c1b6a6fa232606197dc435dc4f84760e6c94681bab9f7cbefc695d708fcca26c2a24578bbde5d1139323568a9234d0c7ac4fb51541777a07e8ddc99c3fc33adc"

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
