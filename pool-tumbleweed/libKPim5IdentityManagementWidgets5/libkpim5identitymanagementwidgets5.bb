SUMMARY = "KDE PIM Libraries: Identity Management - widgets library"
DESCRIPTION = "This package provides graphical widgets to handle multiple email identities \
and associated settings."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5IdentityManagementWidgets5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "fd725a098a8d0b0f92281058eef2a00d65588dbd08fcefe171dc40b34a835b22e53130807659bc8d1af5f56f660fd87fd9885d63c46c9bb86d94f70ec284ffbe"

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
