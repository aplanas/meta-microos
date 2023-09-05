SUMMARY = "Gtk2 IM module for fcitx"
DESCRIPTION = "GTK+ version 2 input module for Fcitx input method rfamework."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-gtk2-4.2.9.9-2.1.aarch64.rpm"
RPM_HASH = "59047e192481f73c51838fc9b4075b4fdc9421956477c9265d5bdca20aacbc6b3fb16af53a224a7a4e106b9091af166100d982ed7d79825fe1422503fcf04130"

RPROVIDES:${PN} += "fcitx-gtk2"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfcitx-gclient.so.1 \
libfcitx-utils.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libxkbcommon.so.0"

inherit rpm
