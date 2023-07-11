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

RPM_NAME = "leechcraft-netstoremanager-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "abc044d8bf14810eef01fe29e8b3b40680424aae8d97936e4a4a1ac94b2f0c5db567d4642e0871456da335999d40946364e98abaaee35ac6a20791e53dd3c2a6"

RPROVIDES:${PN} += "leechcraft-netstoremanager \
libleechcraft-netstoremanager.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-netstoremanager-subplugin \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libboost-container.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
