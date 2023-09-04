SUMMARY = "Dolphin, a GameCube and Wii Emulator"
DESCRIPTION = "Dolphin is an emulator for two Nintendo video game consoles, GameCube and the Wii. \
It allows PC gamers to enjoy games for these two consoles in full HD with several \
enhancements such as compatibility with all PC controllers, turbo speed, \
networked multiplayer, and more. \
Most games run perfectly or with minor bugs."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.17995"

RPM_NAME = "dolphin-emu-5.0.17995-4.1.aarch64.rpm"
RPM_HASH = "31e72716ca2bbfb3748ec78aa43b6a222d7a1b60542a875ac1b853b38fc464e0c08032ae5941ef7884a9b8da0f120ef6f3cbd69013cac41d7d425de15ed84c51"

RPROVIDES:${PN} += "dolphin-emu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLX.so.0 \
libOpenGL.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libXi.so.6 \
libXrandr.so.2 \
libasound.so.2 \
libbluetooth.so.3 \
libbz2.so.1 \
libc.so.6 \
libcurl.so.4 \
libenet.so.7 \
libevdev.so.2 \
libfmt.so.9 \
libgcc-s.so.1 \
libhidapi-hidraw.so.0 \
liblzma.so.5 \
liblzo2.so.2 \
libm.so.6 \
libmbedcrypto.so.7 \
libmbedtls.so.14 \
libmbedx509.so.1 \
libminiupnpc.so.17 \
libpugixml.so.1 \
libpulse.so.0 \
libsfml-network.so.2.6 \
libsfml-system.so.2.6 \
libstdc++.so.6 \
libudev.so.1 \
libusb-1.0.so.0 \
libxxhash.so.0 \
libzstd.so.1 \
nintendo-gamecube-wiimote-udev-rules"

inherit rpm
