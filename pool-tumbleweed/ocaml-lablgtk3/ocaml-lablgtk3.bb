SUMMARY = "Binding to Cairo, a 2D Vector Graphics Library."
DESCRIPTION = "This is an OCaml binding for the Cairo library, a 2D graphics library with support for multiple output devices."
LICENSE = "LGPL-3.0-or-later"

PV = "3.1.3"

RPM_NAME = "ocaml-lablgtk3-3.1.3-2.3.aarch64.rpm"
RPM_HASH = "b211cb434bbe6a27f7b87626dcc078520a2c8ca67e037cfabf429682996a4443c5ed9dfca712cf100420bed811207106d7a888134dd855023e0e5018ba3965ca"

RPROVIDES:${PN} += "ocaml-lablgtk3 \
ocaml-lablgtk3(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtksourceview-3.0.so.1()(64bit) \
libgtkspell3-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit)"

inherit rpm
