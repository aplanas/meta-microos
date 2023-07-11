SUMMARY = "KDE PIM Libraries: Identity Management - widgets library"
DESCRIPTION = "This package provides graphical widgets to handle multiple email identities \
and associated settings."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5IdentityManagementWidgets5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "40805717ee77e942e3a734a3a1b8ce87b2b54b217d9efe1975d7a8867ff5efe6604070c92bc3cdb0fb770c92abe946cb13c5ffdbed4710ff6ba9785bfe3cef97"

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
