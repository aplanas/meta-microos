SUMMARY = "LeechCraft Google Drive storage Module"
DESCRIPTION = "This package provides a Google Drive subplugin for Leechcraft NetStoreManager."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-netstoremanager-googledrive-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "56eb74b03252d864f35b61785c43371b471452b3aa0f9ce7036c549bd99acc544ed4a7ddd823079975dc84488fbe75ab59c587898dc9d106a83d36fc58b7866a"

RPROVIDES:${PN} += "leechcraft-netstoremanager-googledrive \
leechcraft-netstoremanager-googledrive(aarch-64) \
leechcraft-netstoremanager-subplugin \
libleechcraft_netstoremanager_googledrive.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
leechcraft-netstoremanager \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) \
libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
