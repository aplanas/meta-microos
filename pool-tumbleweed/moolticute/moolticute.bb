SUMMARY = "Companion GUI application for Mooltipass password manager devices"
DESCRIPTION = "This project aims to be an easy to use companion to your Mooltipass device and extend the power of the device to more platform/tools. With it you can manage your Mooltipass with a cross-platform app, as well as provide a daemon service that handles all USB communication with the device. This tool comes with a daemon that runs in background, and a user interface app to control your Mooltipass. Other clients can also connect and talk to the daemon (it uses a websocket connection and simple JSON messages). It is completely cross platform, and runs on Linux (using native hidraw API), OS X (native IOKit API), and Windows (native HID API)."
LICENSE = "GPL-3.0-only"

PV = "1.00.1.r0.gf211d93"

RPM_NAME = "moolticute-1.00.1.r0.gf211d93-1.3.aarch64.rpm"
RPM_HASH = "fc008cf473a8144b6c4ca38854eff0ca40c0a4b3d5b0f261a11d2c89e2cf92e5a2fa950f44f8d2f53c0203178f6d71e44465fd289c4ec4546d4265f0c9bdc96b"

RPROVIDES:${PN} += "moolticute"

RDEPENDS:${PN} += "/bin/sh \
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
