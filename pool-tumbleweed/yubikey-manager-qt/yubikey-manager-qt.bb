SUMMARY = "Graphical application for configuring a YubiKey"
DESCRIPTION = "A graphical application for configuring a YubiKey over all transport modes.."
LICENSE = "BSD-2-Clause"

PV = "1.2.5"

RPM_NAME = "yubikey-manager-qt-1.2.5-1.2.aarch64.rpm"
RPM_HASH = "3b6842f41b65670076a592463330de4c2ccef57287bc5423c952d67522a3bc42a4286b2f1cf1b219bc8d631c38db230069b1c9df4aba57a789712f62deab11fc"

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
