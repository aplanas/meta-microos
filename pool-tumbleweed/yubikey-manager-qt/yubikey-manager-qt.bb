SUMMARY = "Graphical application for configuring a YubiKey"
DESCRIPTION = "A graphical application for configuring a YubiKey over all transport modes.."
LICENSE = "BSD-2-Clause"

PV = "1.2.5"

RPM_NAME = "yubikey-manager-qt-1.2.5-1.2.aarch64.rpm"
RPM_HASH = "3b6842f41b65670076a592463330de4c2ccef57287bc5423c952d67522a3bc42a4286b2f1cf1b219bc8d631c38db230069b1c9df4aba57a789712f62deab11fc"

RPROVIDES:${PN} += "application() \
application(ykman-gui.desktop) \
yubikey-manager-qt \
yubikey-manager-qt(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libqt5-qtgraphicaleffects \
libqt5-qtquickcontrols \
libqt5-qtquickcontrols2 \
libstdc++.so.6()(64bit) \
python3-pyotherside \
python3-yubikey-manager"

inherit rpm
