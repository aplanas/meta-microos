SUMMARY = "Gtk3 IM module for fcitx"
DESCRIPTION = "GTK+ version 3 input module for Fcitx input method framework."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-gtk3-4.2.9.9-2.1.aarch64.rpm"
RPM_HASH = "44119b63e58a756d178172b074d4dbdfbe3709f427a86d675c180b58ff2d4f007f6b3e3dd081274b1581c8d5c2e38b3961d3305b810835bd8974f2b8d0d08738"

RPROVIDES:${PN} += "fcitx-gtk3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfcitx-gclient.so.1 \
libfcitx-utils.so.0 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libxkbcommon.so.0"

inherit rpm
