SUMMARY = "Gtk3 IM module for fcitx"
DESCRIPTION = "GTK+ version 3 input module for Fcitx input method framework."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-gtk3-4.2.9.9-1.6.aarch64.rpm"
RPM_HASH = "162f04d8a09c22a566fb82d5a093cb3e1610a12ad3c6b86486b994c0d71fcd82922004594f9c0b71df7db252cd0a005e3c5868d3c62653c0a7550a513a2d3144"

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
