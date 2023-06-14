SUMMARY = "Application to take pictures and videos using a webcam"
DESCRIPTION = "Kamoso is an application to take pictures and videos using a webcam. \
The media can be pushed to some web services such as Facebook and \
YouTube."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kamoso-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "34027d368fb1aa8e592e7b8c1b377bc86346917a93581d8a8395d30481ee3d0824fb86c12cf0e8e4d95adf28fe7fe7edf7be70808ec0ca5b8bed06e85b83a770"

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
