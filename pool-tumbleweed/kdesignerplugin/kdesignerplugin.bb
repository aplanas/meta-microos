SUMMARY = "Framework for integration of KDE frameworks widgets with Qt Designer"
DESCRIPTION = "This framework provides plugins for Qt Designer that allow it to display \
the widgets provided by various KDE frameworks, as well as a utility \
(kgendesignerplugin) that can be used to generate other such plugins \
from ini-style description files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kdesignerplugin-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "f2e22c735aea442921e4fe1cf6c873f38cee60c8ff674b0b804afd6c3f2d5e7bad290621dd396a613ff9d8d2b323de09039fe4c457972892b570fc3da341fa4c"

RPROVIDES:${PN} += "kdesignerplugin"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
