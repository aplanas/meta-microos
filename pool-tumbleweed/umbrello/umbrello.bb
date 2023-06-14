SUMMARY = "UML Modeller"
DESCRIPTION = "Umbrello is a UML modelling application."
LICENSE = "GPL-2.0-only & GFDL-1.2-only & GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "umbrello-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "8a065610d94885100503907f8defba729da9f0e20207a7258534b965b3d71ded2b7a58c7ff5c00a4c901c01736c6ae0cb813121e2c9c813d9a7f1be23813065b"

RPROVIDES:${PN} += "umbrello \
umbrello5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5TextEditor.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.2 \
libxslt.so.1"

inherit rpm
