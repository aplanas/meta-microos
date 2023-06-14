SUMMARY = "Integration of QML and KDE workspaces"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5QuickAddons5-5.106.0-1.2.aarch64.rpm"
RPM_HASH = "bb7ee0bda52112d407c412aad71a3032c18787f26acf3224b74d7a7e741e7c11941771a5d73a8d84536f6f9e40cadd143486765b1d87e7097136c777e35aaa2b"

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
