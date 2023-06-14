SUMMARY = "Theme preview application for GTK 3"
DESCRIPTION = "A widget factory is a theme preview application for GTK. It displays the \
various widget types provided by GTK in a single window allowing to see \
the visual effect of the applied theme. \
 \
This package provides the GTK 3 version."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.0"

RPM_NAME = "awf-gtk3-2.6.0-1.9.aarch64.rpm"
RPM_HASH = "c638b6ac649cbf8b7404668607bae677cf34cf4e2d397a671e89c675e28acafbf087260a34f68b4d661980cbeef96b6b356e8bf70e884d973f679d433b7adc80"

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
