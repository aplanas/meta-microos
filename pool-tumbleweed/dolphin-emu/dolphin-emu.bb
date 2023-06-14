SUMMARY = "Dolphin, a GameCube and Wii Emulator"
DESCRIPTION = "Dolphin is an emulator for two Nintendo video game consoles, GameCube and the Wii. \
It allows PC gamers to enjoy games for these two consoles in full HD with several \
enhancements such as compatibility with all PC controllers, turbo speed, \
networked multiplayer, and more. \
Most games run perfectly or with minor bugs."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.17995"

RPM_NAME = "dolphin-emu-5.0.17995-3.1.aarch64.rpm"
RPM_HASH = "fc30c03b129c95d197db1d16f7d60e4a10351da728a18557b4071bc6672c989cd8624666c0c179d6f4f0d8a7c354cc126dbba4819eb09eeed0ca790e06079377"

RPROVIDES:${PN} += "dolphin-emu"

RDEPENDS:${PN} += "libEGL.so.1 \
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
libsfml-network.so.2.5 \
libsfml-system.so.2.5 \
libstdc++.so.6 \
libudev.so.1 \
libusb-1.0.so.0 \
libxxhash.so.0 \
libzstd.so.1 \
nintendo-gamecube-wiimote-udev-rules"

inherit rpm
