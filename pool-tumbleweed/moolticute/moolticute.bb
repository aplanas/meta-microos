SUMMARY = "Companion GUI application for Mooltipass password manager devices"
DESCRIPTION = "This project aims to be an easy to use companion to your Mooltipass device and extend the power of the device to more platform/tools. With it you can manage your Mooltipass with a cross-platform app, as well as provide a daemon service that handles all USB communication with the device. This tool comes with a daemon that runs in background, and a user interface app to control your Mooltipass. Other clients can also connect and talk to the daemon (it uses a websocket connection and simple JSON messages). It is completely cross platform, and runs on Linux (using native hidraw API), OS X (native IOKit API), and Windows (native HID API)."
LICENSE = "GPL-3.0-only"

PV = "1.01.0.r0.g77100ea"

RPM_NAME = "moolticute-1.01.0.r0.g77100ea-1.1.aarch64.rpm"
RPM_HASH = "8eb583ace6dac4ad6944138b78a1d974ff10a98a2b77813f62defbd8a479172443db20e2be1123db84009548e9e2427500e67385da5c51d1e9abfe5ccab34c24"

RPROVIDES:${PN} += "moolticute"

RDEPENDS:${PN} += "/usr/bin/sh \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5WebSockets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
