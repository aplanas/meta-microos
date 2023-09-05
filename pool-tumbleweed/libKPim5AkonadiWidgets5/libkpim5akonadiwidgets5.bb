SUMMARY = "Akonadi Agent base library"
DESCRIPTION = "This package provides the basic GUI widgets for Akonadi, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5AkonadiWidgets5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "912bfa07050799ce7f084c624492de992eeac2c4e38ebda9255c104a39b671ebc7d25e265bb078bbdad40786685c786bda3d6a84cd1797581122c884f87adfe8"

RPROVIDES:${PN} += "libKPim5AkonadiWidgets.so.5 \
libKPim5AkonadiWidgets5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemModels.so.5 \
libKF5KIOCore.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiPrivate.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
