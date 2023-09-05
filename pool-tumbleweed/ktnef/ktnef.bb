SUMMARY = "Viewer for email attachments in TNEF format"
DESCRIPTION = "KTNEF is a viewer for email attachments in the TNEF format."
LICENSE = "GPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "ktnef-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "e6ab8f87af63d15cfe0df410899bdbb6c8ef86bcb6ac98d87338a5a16e0d92077b900e353d7c10779eace6f623387292907941fa8e649fe2eb710d10757b791b"

RPROVIDES:${PN} += "ktnef \
ktnef5"

RDEPENDS:${PN} += "kdepim-runtime \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5Tnef.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
