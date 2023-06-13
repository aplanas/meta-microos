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
leechcraft-liznoo(aarch-64) \
libleechcraft_liznoo.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
leechcraft \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libleechcraft-util-gui-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-threads-qt5.so.0.6.75()(64bit) \
libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) \
libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) \
libqwt-qt5.so.6.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
qt5qmlimport(QtQuick.2) \
upower"

inherit rpm
