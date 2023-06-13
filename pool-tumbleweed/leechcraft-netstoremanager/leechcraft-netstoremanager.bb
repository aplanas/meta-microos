SUMMARY = "LeechCraft Network file storages Module"
DESCRIPTION = "This package provides a network storage plugin for Leechcraft. \
 \
It allows to manage network storages such as Google Drive. \
Different storages can be added to it without modifying the plugin itself. \
 \
Features: \
 * Upload files from LeechCraft. \
 * Maintain the list of uploaded files. \
 * Delete the uploaded files (if supported by service). \
 * Support for prolongating uploaded files (if supported by service)."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-netstoremanager-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "21934fb7380fe758ad6b91c3fead53ddbf0c9d35378247cd0e70bc2633764674d65239d11ffee430ec3215c8d66aa4a6e162a3aabee1dac620dd23ac66a55a1a"

RPROVIDES:${PN} += "leechcraft-netstoremanager \
leechcraft-netstoremanager(aarch-64) \
libleechcraft_netstoremanager.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
leechcraft \
leechcraft-netstoremanager-subplugin \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libboost_container.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) \
libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
