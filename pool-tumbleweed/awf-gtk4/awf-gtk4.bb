SUMMARY = "Theme preview application for GTK 4"
DESCRIPTION = "A widget factory is a theme preview application for GTK. It displays the \
various widget types provided by GTK in a single window allowing to see \
the visual effect of the applied theme. \
 \
This package provides the GTK 4 version."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.0"

RPM_NAME = "awf-gtk4-2.6.0-1.10.aarch64.rpm"
RPM_HASH = "dd5e2be289ff24578eb7f937e3980db21ba0ced385e75598ba4234469427a7989e1cac1f5a0d97174ff82252ebca0f844ffefdf1b85515066317e7f7c21d659c"

RPROVIDES:${PN} += "awf-gtk4"

RDEPENDS:${PN} += "gtk4 \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0"

inherit rpm
