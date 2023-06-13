SUMMARY = "Gtk2 IM module for fcitx"
DESCRIPTION = "GTK+ version 2 input module for Fcitx input method rfamework."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-gtk2-4.2.9.9-1.5.aarch64.rpm"
RPM_HASH = "7b2a8273af8ea18c9c47c454c328da4eb69d7764570d4df61d20f60d852084b823a2ba4d67cd8d6dee630ee18138ac482999684090e28a111458c298a2b6575f"

RPROVIDES:${PN} += "fcitx-gtk2 \
fcitx-gtk2(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gtk2-tools \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfcitx-gclient.so.1()(64bit) \
libfcitx-utils.so.0()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libxkbcommon.so.0()(64bit)"

inherit rpm
