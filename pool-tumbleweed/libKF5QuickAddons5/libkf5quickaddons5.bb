SUMMARY = "Integration of QML and KDE workspaces"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5QuickAddons5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "5b41db3c3a9992b7c59ec64a34115586bd9de996e9925f744b4ad8c3212178693ff30ccd3de354828fd1a83558130cdaae79cf8eaca507339fa437667d6616a3"

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
