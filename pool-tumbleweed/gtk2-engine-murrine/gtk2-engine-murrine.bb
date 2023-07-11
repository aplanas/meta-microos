SUMMARY = "Murrine GTK Theme Engine"
DESCRIPTION = "Murrine is a GTK+ 2 theme engine, that uses the Cairo vector drawing \
library to render widgets. It features a modern glassy look, is elegant \
and clean on the eyes, and is extremely customizable."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "0.98.2"

RPM_NAME = "gtk2-engine-murrine-0.98.2-10.24.aarch64.rpm"
RPM_HASH = "d82e0a981fcfff41e2749e16ee1128097f5ab9b6a495196d941cd88f75ef58249e7fbba82109f3811ff96e97d6445912f1e1a06e9af39fda0bb31d265f11cf06"

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
