SUMMARY = "KDE PIM Libraries: Identity Management - widgets library"
DESCRIPTION = "This package provides graphical widgets to handle multiple email identities \
and associated settings."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5IdentityManagementWidgets5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "7c3434524b90bdfaf4cc5ac70d72f2a8d683eb1adb2350eac1be3cd13081ec8b77ae386b3729cfa2ff9f7eb22acd281ab22b4ba19d202553ea2a172e72fcc618"

RPROVIDES:${PN} += "libKPim5IdentityManagementWidgets.so.5 \
libKPim5IdentityManagementWidgets5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5IdentityManagement.so.5 \
libKPim5IdentityManagement5 \
libKPim5TextEdit.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
