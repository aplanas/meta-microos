SUMMARY = "HTML Image Map Editor"
DESCRIPTION = "A tool to edit image maps of HTML files"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kimagemapeditor-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "0f7aeab01b8b1463362d141cb2d640b1e5ac93916db4513ccee90295531a02a8278a4865bd79420c00817bea5e3e8d5f775d55a2f5bd3cf40a233171ed54baa7"

RPROVIDES:${PN} += "kimagemapeditor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5Parts.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
