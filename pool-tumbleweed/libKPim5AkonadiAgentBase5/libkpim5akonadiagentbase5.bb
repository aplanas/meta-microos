SUMMARY = "Akonadi Agent base library"
DESCRIPTION = "This package includes the agent library for Akonadi, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5AkonadiAgentBase5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "498b36d2657b9a8347b47dc54ca7c07068c869e87e4f8f6768e41a4c59b689eb960885045d65f130c03a404b4fed85c7a84612664c526efe1159eb61edaa160f"

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
