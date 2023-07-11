SUMMARY = "Integration of QML and KDE workspaces"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5QuickAddons5-5.107.0-1.2.aarch64.rpm"
RPM_HASH = "915029b226b779de16be7045fa1b9063decfe92cf02e262b94087bb7bf94a957ed3f8eccd518b5b8ebe6d693c854b68b9c782c1aab4caf4cb15e0f67cb9a8e79"

RPROVIDES:${PN} += "libKF5QuickAddons.so.5 \
libKF5QuickAddons5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5Declarative.so.5 \
libKF5I18n.so.5 \
libKF5Package.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
