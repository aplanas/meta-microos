SUMMARY = "Graphical disk usage viewer"
DESCRIPTION = "Filelight creates an interactive visualization of disk usage \
and the sizes of files and directories on the system."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "filelight-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "3067f3224b5120364229898cade9eaabd851ddf299f0ecae9a3462b5fd63a6f82481719de74e58694a402e94ebd7e3f166ff8e18b0bebd38bab0a8ed8a2fbaa7"

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
