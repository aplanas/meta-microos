SUMMARY = "Programming language for GNOME"
DESCRIPTION = "Vala is an object-oriented programming language with a self-hosting \
compiler that generates C code and uses the GObject system."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.8"

RPM_NAME = "vala-0.56.8-1.1.aarch64.rpm"
RPM_HASH = "c8319857aff18e6c08ca6a03761364d82e17770777bf93a349f74b4979f57e862f78344491934ba89ebf774075fd419069add7f8b87aa180b597821e78594ebd"

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
