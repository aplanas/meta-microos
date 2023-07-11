SUMMARY = "Development files for PolicyKit"
DESCRIPTION = "Development files for PolicyKit Authorization Framework."
LICENSE = "LGPL-2.1-or-later"

PV = "121"

RPM_NAME = "polkit-devel-121-4.3.aarch64.rpm"
RPM_HASH = "8326dfc97ec1829d7efd93848f7758f4a0064c1540c379480513d3cb0fdaf2196c766392bfc21a386d297098ae7263e28a449a794dca44fdfcd67fc4db2b9ac6"

RPROVIDES:${PN} += "pkgconfig-polkit-agent-1 \
pkgconfig-polkit-gobject-1 \
polkit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libc.so.6 \
libglib-2.0.so.0 \
libpolkit-agent-1-0 \
libpolkit-gobject-1-0 \
pkgconfig \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-polkit-gobject-1 \
polkit \
typelib-1-0-Polkit-1-0"

inherit rpm
