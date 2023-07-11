SUMMARY = "Gtk2 IM module for fcitx"
DESCRIPTION = "GTK+ version 2 input module for Fcitx input method rfamework."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-gtk2-4.2.9.9-1.6.aarch64.rpm"
RPM_HASH = "e14c519efabe0fb8352de751df883f408d13d0885c487e92eacad29b781ce2e8c1d6b1e6a4a3d2ab6a2af82f739e117f8061b2e191bc21d49693d606698aa1fc"

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
