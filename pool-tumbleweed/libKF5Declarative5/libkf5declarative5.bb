SUMMARY = "Integration of QML and KDE workspaces"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Declarative5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "c859b021b6e3e424fe1b46c1184d53f56d6963981291ff09a5ca3e4280a6f1c77b567d97b957cbad2882983d0106614626eaaa5052c11ba3996bb341d665a26d"

RPROVIDES:${PN} += "libKF5Declarative.so.5 \
libKF5Declarative5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Package.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
