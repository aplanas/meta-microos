SUMMARY = "Theme preview application for GTK 3"
DESCRIPTION = "A widget factory is a theme preview application for GTK. It displays the \
various widget types provided by GTK in a single window allowing to see \
the visual effect of the applied theme. \
 \
This package provides the GTK 3 version."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "awf-gtk3-2.7.0-2.1.aarch64.rpm"
RPM_HASH = "ae5a8a8a7231f40736b0c2786c89cf5f792b8d13807a5cb4d75d71c9e659c65d9256e02b57d4cca82c02ce04dd2e8dcec66700a20bc80e6f30a0bad1d1cd0d03"

RPROVIDES:${PN} += "awf-gtk3"

RDEPENDS:${PN} += "gtk3 \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
