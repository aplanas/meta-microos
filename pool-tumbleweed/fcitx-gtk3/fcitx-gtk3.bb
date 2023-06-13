SUMMARY = "Gtk3 IM module for fcitx"
DESCRIPTION = "GTK+ version 3 input module for Fcitx input method framework."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-gtk3-4.2.9.9-1.5.aarch64.rpm"
RPM_HASH = "ff54bc0d447364e61222d22f385b3f5c5e3fdccf4178e5d467069a3799fb5963d0137b816bf7749f01fe5aadf430cd76ec0a7868d131b8119e574d5d923853c0"

RPROVIDES:${PN} += "fcitx-gtk3 \
fcitx-gtk3(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gtk3-tools \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfcitx-gclient.so.1()(64bit) \
libfcitx-utils.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libxkbcommon.so.0()(64bit)"

inherit rpm
