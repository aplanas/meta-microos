SUMMARY = "Integration of QML and KDE workspaces"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5QuickAddons5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "536a4467e8c9782c421ce49a0a53137d4e53f74f46064850703d383c316613d6e776ccd856e1aa6a6859f47f3c249b0ec56ad2aa05f0f2d3e4102b11936924ee"

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
