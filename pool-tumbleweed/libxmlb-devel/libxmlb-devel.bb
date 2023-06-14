SUMMARY = "Development package for libxmlb"
DESCRIPTION = "Files for development with libxmlb."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.11"

RPM_NAME = "libxmlb-devel-0.3.11-1.1.aarch64.rpm"
RPM_HASH = "98fb1f7349afd4546b7302ca9b30d5669f7c5539f5f07123464cf6d753dad4fa34d230e085372d166c3205c9010aa6a6ebebe85c63fae6f11e65ac413a64b72d"

RPROVIDES:${PN} += "libxmlb-devel \
pkgconfig-xmlb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblzma.so.5 \
libxmlb2 \
libzstd.so.1 \
pkgconfig-gio-2.0 \
pkgconfig-liblzma \
pkgconfig-libzstd \
typelib-1-0-Xmlb-1-0 \
xmlb-tool"

inherit rpm
