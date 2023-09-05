SUMMARY = "Library which provides import/export functionality for KAddressbook"
DESCRIPTION = "This library provides an interface to implement import/export plugins for KAddressbook."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5AddressbookImportExport5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "e11692a60aa0dee084c3c28432aa63c60e4edfb7e302d63f057f1e3194e0a0199780d07185dea178a0e65e55f957f5d112814ec95bfaa125b8486e480f863a13"

RPROVIDES:${PN} += "libKPim5AddressbookImportExport.so.5 \
libKPim5AddressbookImportExport5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5PimCommon.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
