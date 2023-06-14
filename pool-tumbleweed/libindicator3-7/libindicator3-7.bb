SUMMARY = "Panel indicator applet library"
DESCRIPTION = "This package provides the libraries required to build indicators \
and to go into the indicator applet."
LICENSE = "GPL-3.0-only"

PV = "16.10.0+bzr20171205"

RPM_NAME = "libindicator3-7-16.10.0+bzr20171205-4.15.aarch64.rpm"
RPM_HASH = "bcbab9bb847e3a3c7151d384617b4e3ae8526ef74c05448f7e4833316e25b6c38cf2e0e9fdf32daa7a1d3c8d360cfa6318378aba2546e1c865538423f22b9b8c"

RPROVIDES:${PN} += "libindicator3-7 \
libindicator3.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
