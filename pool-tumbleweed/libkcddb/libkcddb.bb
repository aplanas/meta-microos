SUMMARY = "CDDB library for KDE Applications"
DESCRIPTION = "The KDE Compact Disc DataBase library provides an API for \
applications to fetch and submit audio CD \
information over the Internet."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libkcddb-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "e15b93d7fc160c56b4bc13305b2f20234158a481d1305db88ff0c95834b0dddb3e385a5e82f41f7fa8b94444492c6c8c056d15d15256cf8525e1747904571e7b"

RPROVIDES:${PN} += "libkcddb \
libkcddb16 \
libkcddb5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Cddb.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
