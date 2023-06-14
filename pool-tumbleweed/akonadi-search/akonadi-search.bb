SUMMARY = "Framework for searching and managing PIM metadata"
DESCRIPTION = "AkonadiSearch is a framework for searching and managing PIM metadata"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "akonadi-search-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "bdbab666503de52798db871c394a7ab38fe6cc8c4f08f4a1c9da2fb7b8d39f0d86858434f0975ffb8ad8f3237ec3a60633a1ce371b5a82f14332b6e565d48175"

RPROVIDES:${PN} += "akonadi-search"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKF5Codecs.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Runner.so.5 \
libKPim5AkonadiAgentBase.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiMime.so.5 \
libKPim5AkonadiSearchCore.so.5 \
libKPim5AkonadiSearchPIM.so.5 \
libKPim5AkonadiSearchXapian.so.5 \
libKPim5Mime.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxapian.so.30"

inherit rpm
