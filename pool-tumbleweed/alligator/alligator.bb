SUMMARY = "Convergent RSS/Atom feed reader"
DESCRIPTION = "Alligator is a convergent RSS/Atom feed reader."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "alligator-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "746d97bb662c2ba877033872a2fe5e6dee68ae55f153738b4c29a18da8edddf4acc290f1ef129cc123417b86382ef9976ebd415d965bac8973331f23c6220b7d"

RPROVIDES:${PN} += "alligator"

RDEPENDS:${PN} += "kirigami-addons \
kirigami2 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Syndication.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5QuickControls2.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
