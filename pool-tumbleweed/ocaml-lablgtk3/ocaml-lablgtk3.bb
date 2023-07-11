SUMMARY = "Binding to Cairo, a 2D Vector Graphics Library."
DESCRIPTION = "This is an OCaml binding for the Cairo library, a 2D graphics library with support for multiple output devices."
LICENSE = "LGPL-3.0-or-later"

PV = "3.1.3"

RPM_NAME = "ocaml-lablgtk3-3.1.3-2.4.aarch64.rpm"
RPM_HASH = "841e24e11f83154bdf3c100ba632ed635df3ab797875b473eef69ec981b3d88a04170e11ef3e59d736974234bc4faa7a3a8801b9a01781e5b504fb2239315e2c"

RPROVIDES:${PN} += "ocaml-lablgtk3"

RDEPENDS:${PN} += "libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-3.0.so.1 \
libgtkspell3-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
