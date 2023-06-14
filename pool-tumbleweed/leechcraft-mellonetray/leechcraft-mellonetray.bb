SUMMARY = "LeechCraft Tray Area Module"
DESCRIPTION = "This package provides a tray area quark for third-party apps \
for LeechCraft SB2."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-mellonetray-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "ed667c286b7806863bbad2447a2986dd8c33c0244144ecdc8946a64f74f02acbea3cb456540ff8d34d7697e3984a8af0073ecbabe2304953d452ca3367901c4d"

RPROVIDES:${PN} += "leechcraft-mellonetray \
libleechcraft-mellonetray.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-sb2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libXdamage.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-x11-qt5.so.0.6.75 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2"

inherit rpm
