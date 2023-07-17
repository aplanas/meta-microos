SUMMARY = "Integration of QML and KDE workspaces"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Declarative5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "3aaf9342baed9f90f019141833808fd88e9caa84183020650e7df6addf691180754351f17ece5982c3747865859f219889ea3ac965078f52fd5f74412147ce1c"

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
