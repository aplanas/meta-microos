SUMMARY = "Akonadi Agent base library"
DESCRIPTION = "This package includes the agent library for Akonadi, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5AkonadiAgentBase5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "bb9c5dfdeb15a60c6b815959a4c97bcb94ef245ff444501d488b3125a47c2fdd05250ada003bbdceb5160c668dff6f262703263595479b32cfbc192535eb5879"

RPROVIDES:${PN} += "libKPim5AkonadiAgentBase.so.5 \
libKPim5AkonadiAgentBase5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiPrivate.so.5 \
libKPim5AkonadiWidgets.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libaccounts-qt5.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkaccounts.so.2 \
libstdc++.so.6"

inherit rpm
