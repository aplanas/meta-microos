SUMMARY = "Image Scanner Application"
DESCRIPTION = "Skanlite is an image scanner application by KDE."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "skanlite-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "018d5f497675b8d40f9f1dbab16a4c622b4e90d85c8ad95145140bf43daffebe61940f607c9a30612524f4d4c7d31cf9e6a2fefedcd742d9f0fc6da68dce9050"

RPROVIDES:${PN} += "skanlite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Sane.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
