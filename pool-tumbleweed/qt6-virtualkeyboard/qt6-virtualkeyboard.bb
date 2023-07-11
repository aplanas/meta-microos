SUMMARY = "Framework for writing or integrating input methods and engines for Qt 6"
DESCRIPTION = "Qt VirtualKeyboard provides an input framework and reference keyboard frontend \
for Qt 6."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-virtualkeyboard-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "7e48c0410de829f44bcc7248fe0d121014b612761e332782b5208cf276584e7aac7d3973d2405ea0e4fc53d726a2600e8901463c0a1050a33c944a58814bdadf"

RPROVIDES:${PN} += "libqtvirtualkeyboardplugin.so \
qt6-virtualkeyboard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6VirtualKeyboard.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
