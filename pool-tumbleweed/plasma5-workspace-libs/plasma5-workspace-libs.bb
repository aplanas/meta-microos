SUMMARY = "The KDE Plasma Workspace Components"
DESCRIPTION = "This package contains the basic packages for a KDE Plasma 5 workspace."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "plasma5-workspace-libs-5.27.5-2.4.aarch64.rpm"
RPM_HASH = "647a6809bf1050731a24c4396f2384089b3f2e23eeff62c1d82242e2b708e027e73bab33dda05e0d761a442bdf5b45bb4bb7dc900147346dcf61e62e5fac55e9"

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
