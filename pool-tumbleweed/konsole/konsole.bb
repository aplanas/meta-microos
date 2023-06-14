SUMMARY = "KDE Terminal"
DESCRIPTION = "Konsole is a terminal emulator for the K Desktop Environment."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "konsole-23.04.1-1.2.aarch64.rpm"
RPM_HASH = "0836e888023a80251aa55651dac933e89f7333eb7975bb9b69d4a42f9f55a5c191a46d6724e9675eaa23632421da335533595a8fd728f81d00086fdbc504077e"

RPROVIDES:${PN} += "konsole \
konsole5 \
libkonsoleapp.so.1"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
konsole-part \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libkonsoleprivate.so.1 \
libstdc++.so.6"

inherit rpm
