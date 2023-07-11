SUMMARY = "NetworkManager Tray applet"
DESCRIPTION = "nm-tray is a simple NetworkManager front end with information icon residing in system tray (like nm-applet), but a pure Qt implementation."
LICENSE = "GPL-2.0-only"

PV = "0.5.0"

RPM_NAME = "nm-tray-0.5.0-1.8.aarch64.rpm"
RPM_HASH = "9f42d2c62bb9819abb1b85d66679b0adca9cad057882878c811bf672bbe2ea50b025d6a8a8b562e62a6c4976981587b26ead23f233d7662c94e72924a53179a7"

RPROVIDES:${PN} += "nm-tray"

RDEPENDS:${PN} += "NetworkManager \
ld-linux-aarch64.so.1 \
libKF5NetworkManagerQt.so.6 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
