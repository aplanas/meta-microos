SUMMARY = "Core libraries for AkonadiSearch"
DESCRIPTION = "AkonadiSearch is a framework for searching and managing PIM metadata. \
This package contains the core libraries"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "23.04.3"

RPM_NAME = "libKPim5AkonadiSearch5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "5c0719eba611107dd9ad55f1297b1bd44e9479dc3a696797be0584fe5a86ca395ab7876b75819165c37de87da20e48f7d3487a6f48fd7d33022ee65f2511be65"

RPROVIDES:${PN} += "libKPim5AkonadiSearch5 \
libKPim5AkonadiSearchCore.so.5 \
libKPim5AkonadiSearchDebug.so.5 \
libKPim5AkonadiSearchPIM.so.5 \
libKPim5AkonadiSearchXapian.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libKPim5AkonadiCore.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxapian.so.30"

inherit rpm
