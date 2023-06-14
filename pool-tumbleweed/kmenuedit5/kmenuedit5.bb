SUMMARY = "Provides the interface and basic tools for the KDE workspace"
DESCRIPTION = "Provides the interface and basic tools for the KDE workspace."
LICENSE = "GPL-2.0-only"

PV = "5.27.5"

RPM_NAME = "kmenuedit5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "b6e80731883721d27fa0f7c5b49dd7b270c4865c18fddc0565d6788174b10efff0091b587c35759b971049a6457351da428f90b4962bdf0c9fc446c7d388f8db"

RPROVIDES:${PN} += "kmenuedit5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Service.so.5 \
libKF5SonnetCore.so.5 \
libKF5SonnetUi.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
