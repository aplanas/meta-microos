SUMMARY = "Framework for writing or integrating input methods and engines for Qt 6"
DESCRIPTION = "Qt VirtualKeyboard provides an input framework and reference keyboard frontend \
for Qt 6."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-virtualkeyboard-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "1161d082b163170397ea1ddb91bec03b9b068e9755f3b1773f6698dae8c5ae861abc88beeea77b42d4136a138e99b3412a5bb99e2330ff20ddde5663852d5f99"

RPROVIDES:${PN} += "libqtvirtualkeyboardplugin.so \
qt6-virtualkeyboard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6VirtualKeyboard.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
