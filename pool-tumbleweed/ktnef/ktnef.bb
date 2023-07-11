SUMMARY = "Viewer for email attachments in TNEF format"
DESCRIPTION = "KTNEF is a viewer for email attachments in the TNEF format."
LICENSE = "GPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "ktnef-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "843a142b908983eaa0deed1c6f0d81a353383d2c2b6c9ae0e075db8086b5c645d4cee5d5e6ad8983e7d1cf37a553c516dce98a7efe54e49a1a0bdb08fbe4b25b"

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
