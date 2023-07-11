SUMMARY = "Programming language for GNOME"
DESCRIPTION = "Vala is an object-oriented programming language with a self-hosting \
compiler that generates C code and uses the GObject system."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.9"

RPM_NAME = "vala-0.56.9-1.1.aarch64.rpm"
RPM_HASH = "ba50fe922d0b6b563cd34ec4621d3634a94d25d90bfc7dad0d9e47e83788fd6aa221f6ffa34f8cb0bda380e3bb5f94058626fad2095e716fa38a401b5f281351"

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
