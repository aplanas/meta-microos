SUMMARY = "Viewer for email attachments in TNEF format"
DESCRIPTION = "KTNEF is a viewer for email attachments in the TNEF format."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "ktnef-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "88ac4aa292a419006bb219fc294ee25aef8d959006609723ae881d3bd4377aa169fe3cbfd515a338e8da5720eaa7f54c20ff93b70309189a5fd4c48162c29e17"

RPROVIDES:${PN} += "application() \
application(org.kde.ktnef.desktop) \
ktnef \
ktnef(aarch-64) \
ktnef5 \
mimehandler(application/ms-tnef)"

RDEPENDS:${PN} += "kdepim-runtime \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPim5Tnef.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
