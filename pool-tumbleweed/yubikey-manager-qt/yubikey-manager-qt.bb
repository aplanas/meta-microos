SUMMARY = "Graphical application for configuring a YubiKey"
DESCRIPTION = "A graphical application for configuring a YubiKey over all transport modes.."
LICENSE = "BSD-2-Clause"

PV = "1.2.5"

RPM_NAME = "yubikey-manager-qt-1.2.5-1.3.aarch64.rpm"
RPM_HASH = "d7e6d4880b458650fc6d0282c317bbd66f5030d272cc3a6d81b4da02ed7a8f0dad6f37bc5fd572562bf65c4abac1119587f184ff90e52fe0b734a776797945f6"

RPROVIDES:${PN} += "yubikey-manager-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5QuickControls2.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqt5-qtgraphicaleffects \
libqt5-qtquickcontrols \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
python3-pyotherside \
python3-yubikey-manager"

inherit rpm
