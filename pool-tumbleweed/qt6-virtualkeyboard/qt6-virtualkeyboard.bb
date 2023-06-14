SUMMARY = "Framework for writing or integrating input methods and engines for Qt 6"
DESCRIPTION = "Qt VirtualKeyboard provides an input framework and reference keyboard frontend \
for Qt 6."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-virtualkeyboard-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0ce19274099dc1a2b65e1d4ec814d960885dec7dd2874cbee86e93336ef9da602adbe52fb43a974390bf36973d5d2fb0cadf3b0f3cc01ec9d216964e55680b6d"

RPROVIDES:${PN} += "libqtvirtualkeyboardplugin.so \
qt6-virtualkeyboard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6VirtualKeyboard.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
