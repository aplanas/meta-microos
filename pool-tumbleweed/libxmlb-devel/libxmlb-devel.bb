SUMMARY = "Development package for libxmlb"
DESCRIPTION = "Files for development with libxmlb."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.13"

RPM_NAME = "libxmlb-devel-0.3.13-1.1.aarch64.rpm"
RPM_HASH = "9b86ebb90a849779d9651810cfad363899a44c3aaa7a16db6882d594341a8d49ad3bafa5b21b2eb5834992f525f7ab0876f6789688aee9fb78cab382f4f4adde"

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
