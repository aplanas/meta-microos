SUMMARY = "Programming language for GNOME"
DESCRIPTION = "Vala is an object-oriented programming language with a self-hosting \
compiler that generates C code and uses the GObject system."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.8"

RPM_NAME = "vala-0.56.8-1.1.aarch64.rpm"
RPM_HASH = "c8319857aff18e6c08ca6a03761364d82e17770777bf93a349f74b4979f57e862f78344491934ba89ebf774075fd419069add7f8b87aa180b597821e78594ebd"

RPROVIDES:${PN} += "libvalaccodegen.so()(64bit) \
pkgconfig(vapigen) \
pkgconfig(vapigen-0.56) \
vala \
vala(aarch-64) \
vala-devel"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libvala-0.56.so.0()(64bit) \
update-alternatives"

inherit rpm
