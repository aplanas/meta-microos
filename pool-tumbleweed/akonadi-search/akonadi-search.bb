SUMMARY = "Framework for searching and managing PIM metadata"
DESCRIPTION = "AkonadiSearch is a framework for searching and managing PIM metadata"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "23.04.3"

RPM_NAME = "akonadi-search-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "e1809e82edaabb8824c5d314dfe27dc54926eaae0148b9d8d7667ef275c57e2d64f016162750ec54ba00969cfb4b5d151aa458ad464e2ab51add2427b88275a9"

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
