SUMMARY = "Akonadi Agent base library"
DESCRIPTION = "This package includes the agent library for Akonadi, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5AkonadiAgentBase5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "9d3bb00c79c581b6336e9945566d0c274e89fe3946a50fc35e24eb57ac3fd37bb8f89cb8b8c18fa26384b1cd19d213c65b3dd726f5058a5af713ecea557b515c"

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
