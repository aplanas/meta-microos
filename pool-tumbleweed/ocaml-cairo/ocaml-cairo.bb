SUMMARY = "Binding to Cairo, a 2D Vector Graphics Library."
DESCRIPTION = "This is an OCaml binding for the Cairo library, a 2D graphics library with support for multiple output devices."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.4"

RPM_NAME = "ocaml-cairo-0.6.4-2.4.aarch64.rpm"
RPM_HASH = "aead376a61c2685e3571c7eba5cf3c180a7c49f5c347450de4ba755af6aee5e019473a5be0250f994615a42f421ef0f9fe0093dfc60ff16e40fb2ca7c8e6fc73"

RPROVIDES:${PN} += "ocaml-cairo"

RDEPENDS:${PN} += "libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6"

inherit rpm
