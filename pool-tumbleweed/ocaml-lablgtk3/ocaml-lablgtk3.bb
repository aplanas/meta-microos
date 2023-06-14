SUMMARY = "Binding to Cairo, a 2D Vector Graphics Library."
DESCRIPTION = "This is an OCaml binding for the Cairo library, a 2D graphics library with support for multiple output devices."
LICENSE = "LGPL-3.0-or-later"

PV = "3.1.3"

RPM_NAME = "ocaml-lablgtk3-3.1.3-2.3.aarch64.rpm"
RPM_HASH = "b211cb434bbe6a27f7b87626dcc078520a2c8ca67e037cfabf429682996a4443c5ed9dfca712cf100420bed811207106d7a888134dd855023e0e5018ba3965ca"

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
