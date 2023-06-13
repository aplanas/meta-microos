SUMMARY = "Core libraries for AkonadiSearch"
DESCRIPTION = "AkonadiSearch is a framework for searching and managing PIM metadata. \
This package contains the core libraries"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "libKPim5AkonadiSearch5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "afa6c853f76eaff46add7079b2b7e8ff2b0e8e0d1d660a34d4b4af5e6349d836861a3e4dee3ab69872d36656237f750e3af59bf6be8ceed908cc3eafb32063b7"

RPROVIDES:${PN} += "libKPim5AkonadiSearch5 \
libKPim5AkonadiSearch5(aarch-64) \
libKPim5AkonadiSearchCore.so.5()(64bit) \
libKPim5AkonadiSearchDebug.so.5()(64bit) \
libKPim5AkonadiSearchPIM.so.5()(64bit) \
libKPim5AkonadiSearchXapian.so.5()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKPim5AkonadiCore.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libxapian.so.30()(64bit)"

inherit rpm
