SUMMARY = "Library which provides import/export functionality for KAddressbook"
DESCRIPTION = "This library provides an interface to implement import/export plugins for KAddressbook."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5AddressbookImportExport5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "42e64e5844ba32fd32e4e12e5fe05e74de05a7fb29c3e62d3f918803a67875e016352604fdad7743318a759825f9aa9fa8bb893d2c53d4abf00cb71ba0121ca6"

RPROVIDES:${PN} += "libKPim5AddressbookImportExport.so.5 \
libKPim5AddressbookImportExport5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5PimCommon.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiWidgets.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
