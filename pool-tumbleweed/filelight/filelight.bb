SUMMARY = "Graphical disk usage viewer"
DESCRIPTION = "Filelight creates an interactive visualization of disk usage \
and the sizes of files and directories on the system."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.04.3"

RPM_NAME = "filelight-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "45c997d2933bbf8b529cb4918abca9ff481846d01a1b9f8665ea413aec28565b32cb74076303c3309a13cafd5242e7a96008861cd5c13c36020ecdcaa4c978d1"

RPROVIDES:${PN} += "config-filelight \
filelight \
filelight5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
