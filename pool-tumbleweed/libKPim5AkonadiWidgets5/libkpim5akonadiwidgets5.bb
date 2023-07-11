SUMMARY = "Akonadi Agent base library"
DESCRIPTION = "This package provides the basic GUI widgets for Akonadi, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5AkonadiWidgets5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "233fba156f84c747c5da785f15eda4194397c29b4d2e8fbbeaa96885b76fda99d42da7cf11440561a4b7cb2d51ff8f266cba3bb07e89de74d0d90d1ca997c69c"

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
