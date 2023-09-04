SUMMARY = "The KDE Plasma Workspace Components"
DESCRIPTION = "This package contains the basic packages for a KDE Plasma 5 workspace."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "plasma5-workspace-libs-5.27.7-3.1.aarch64.rpm"
RPM_HASH = "b2414b620bc68e960928dc4185572f272988237a7a1bc5dff7e0bbbd7e77adb271c6a2e7de0e4dc452dd75ed65ae78d8c9cc4a455b9769ead10cb813c83d7667"

RPROVIDES:${PN} += "libcolorcorrect.so.5 \
libkrdb.so \
libkworkspace5.so.5 \
libnotificationmanager.so.1 \
libplasma-geolocation-interface.so.5 \
libtaskmanager.so.6 \
libweather-ion.so.7 \
plasma5-workspace-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
kio \
kservice \
ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5Activities5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5CoreAddons5 \
libKF5I18n.so.5 \
libKF5I18n5 \
libKF5ItemModels.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5Notifications.so.5 \
libKF5Plasma.so.5 \
libKF5Screen.so.8 \
libKF5Service.so.5 \
libKF5WaylandClient.so.5 \
libKF5WindowSystem.so.5 \
libKF5WindowSystem5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5DBus.so.5 \
libQt5DBus5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets5 \
libQt5X11Extras.so.5 \
libQt5X11Extras5 \
libX11.so.6 \
libXau.so.6 \
libc.so.6 \
libksysguard5 \
libm.so.6 \
libstdc++.so.6 \
plasma-framework"

inherit rpm
