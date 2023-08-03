SUMMARY = "Framework for writing or integrating input methods and engines for Qt 6"
DESCRIPTION = "Qt VirtualKeyboard provides an input framework and reference keyboard frontend \
for Qt 6."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-virtualkeyboard-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "c05e7ad506fd02539f0077322fa930abef6ea98804289bb1c22277562751ff71836af427f526fad9a9c7116e4233ff4f65b7e45f9a2ffefa3b36574b2274cf0f"

RPROVIDES:${PN} += "libqtvirtualkeyboardplugin.so \
qt6-virtualkeyboard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6VirtualKeyboard.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
