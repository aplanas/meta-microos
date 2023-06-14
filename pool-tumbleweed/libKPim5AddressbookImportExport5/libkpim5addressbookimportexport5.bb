SUMMARY = "Library which provides import/export functionality for KAddressbook"
DESCRIPTION = "This library provides an interface to implement import/export plugins for KAddressbook."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5AddressbookImportExport5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "779d30408d45a8acb7c666311fc89c7f367bf1237cc969a897632ba4067d2c02761a620acc5b64320858446d78aff5d0cfa9850ea2d0cb9ac8e620d8a513e83c"

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
