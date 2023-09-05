SUMMARY = "Framework for searching and managing PIM metadata"
DESCRIPTION = "AkonadiSearch is a framework for searching and managing PIM metadata"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "akonadi-search-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "9158804993d659ec1d085b2ee21d0d9c3a2d1fe7aa3affb09f7c3b03441242777bef5d155df1ec308fabab49c82b0e431d1fc12972a8885188e0bea9086cab8d"

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
