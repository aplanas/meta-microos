SUMMARY = "Programming language for GNOME"
DESCRIPTION = "Vala is an object-oriented programming language with a self-hosting \
compiler that generates C code and uses the GObject system."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.13"

RPM_NAME = "vala-0.56.13-1.1.aarch64.rpm"
RPM_HASH = "a7db25113536312a6522fe2202156e33a58a7dbd56f5054b94434dfb617a9230258674a057a66431d801e833fe3a2960fdf52a008f9013fbc16d385584c6960e"

RPROVIDES:${PN} += "libvalaccodegen.so \
pkgconfig-vapigen \
pkgconfig-vapigen-0.56 \
vala \
vala-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libvala-0.56.so.0 \
update-alternatives"

inherit rpm
