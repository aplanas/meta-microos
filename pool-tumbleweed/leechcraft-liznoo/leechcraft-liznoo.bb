SUMMARY = "LeechCraft Power management module"
DESCRIPTION = "This package provides a power manager plugin for Leechcraft \
which makes use of upower. \
 \
Features: \
 * Displays battery status in LeechCraft tray. \
 * Displays battery charge and power consumption history. \
 * Notifies other plugins about sleep and resume events. This way, plugins \
   like Azoth can disconnect from servers gracefully on hibernation and \
   reconnect properly on startup. \
 * Allows the user to sleep/hibernate the system. \
 * Notifies the user when device starts discharging or charging. \
 * Notifies the user on low capacity."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-liznoo-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "4ccc210db9b5a7df7e755d9a3afc1f3d5bf81e067c96eb50f8ade51c9231e6762d12460b0088e98084fa4344241acecf57a6460f33f60fa6f191ec0512b69cdf"

RPROVIDES:${PN} += "leechcraft-liznoo \
libleechcraft-liznoo.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-threads-qt5.so.0.6.75 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libqwt-qt5.so.6.2 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
upower"

inherit rpm
