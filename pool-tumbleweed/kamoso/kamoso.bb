SUMMARY = "Application to take pictures and videos using a webcam"
DESCRIPTION = "Kamoso is an application to take pictures and videos using a webcam. \
The media can be pushed to some web services such as Facebook and \
YouTube."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kamoso-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "ecaf6751216dd6dfd09020819b7980ce98ddf93879de9586f2ab7ed0b8af8ae1c0c5a000f12f10ae6b9e61b2aaba7e4baf62e666f87dad79048ccf3bea100d41"

RPROVIDES:${PN} += "kamoso"

RDEPENDS:${PN} += "gstreamer-plugins-bad \
gstreamer-plugins-base \
gstreamer-plugins-good \
kirigami2 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
