SUMMARY = "Murrine GTK Theme Engine"
DESCRIPTION = "Murrine is a GTK+ 2 theme engine, that uses the Cairo vector drawing \
library to render widgets. It features a modern glassy look, is elegant \
and clean on the eyes, and is extremely customizable."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "0.98.2"

RPM_NAME = "gtk2-engine-murrine-0.98.2-10.23.aarch64.rpm"
RPM_HASH = "d2d129ed3ea9e88c2af45eb623dd5493d81e0a5a2810c6c9630b15bf6d50704b9624a3444ce07916fab136fb760004c365ca9633a29a6c45a7e84d06722453da"

RPROVIDES:${PN} += "gtk2-engine-murrine \
libmurrine.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpangocairo-1.0.so.0 \
libpixman-1.so.0"

inherit rpm
