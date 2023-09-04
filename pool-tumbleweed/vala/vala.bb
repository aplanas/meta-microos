SUMMARY = "Programming language for GNOME"
DESCRIPTION = "Vala is an object-oriented programming language with a self-hosting \
compiler that generates C code and uses the GObject system."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.12"

RPM_NAME = "vala-0.56.12-1.1.aarch64.rpm"
RPM_HASH = "b28104a83d31bab950a714d870a4b4c1f92f7fd957267d3074d5ebd6662699a6d3bbb78236e059831a206625574a271bb73450a92b404a15b6443fdaa66f994b"

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
