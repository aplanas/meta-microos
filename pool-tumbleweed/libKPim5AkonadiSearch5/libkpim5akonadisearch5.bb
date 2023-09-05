SUMMARY = "Core libraries for AkonadiSearch"
DESCRIPTION = "AkonadiSearch is a framework for searching and managing PIM metadata. \
This package contains the core libraries"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "libKPim5AkonadiSearch5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "7fef1e13facb3d47030c1bfcb733428925daac1be06c2c0dc1f5fd8e3377a928680de6dc6566f364b69d57c654b9d6e0f00ff8a656fe26c1afba765c6ef80d05"

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
