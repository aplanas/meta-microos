SUMMARY = "KDE PIM Libraries: Identity Management - widgets library"
DESCRIPTION = "This package provides graphical widgets to handle multiple email identities \
and associated settings."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5IdentityManagementWidgets5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "fd725a098a8d0b0f92281058eef2a00d65588dbd08fcefe171dc40b34a835b22e53130807659bc8d1af5f56f660fd87fd9885d63c46c9bb86d94f70ec284ffbe"

RPROVIDES:${PN} += "libKPim5IdentityManagementWidgets.so.5()(64bit) \
libKPim5IdentityManagementWidgets5 \
libKPim5IdentityManagementWidgets5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPim5IdentityManagement.so.5()(64bit) \
libKPim5IdentityManagement5 \
libKPim5TextEdit.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
