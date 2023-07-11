SUMMARY = "Dolphin, a GameCube and Wii Emulator"
DESCRIPTION = "Dolphin is an emulator for two Nintendo video game consoles, GameCube and the Wii. \
It allows PC gamers to enjoy games for these two consoles in full HD with several \
enhancements such as compatibility with all PC controllers, turbo speed, \
networked multiplayer, and more. \
Most games run perfectly or with minor bugs."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.17995"

RPM_NAME = "dolphin-emu-5.0.17995-3.3.aarch64.rpm"
RPM_HASH = "71268d2d429dfc04726b7f7e6adf26323aea5c584fefe0e4059cebd2af39c9ae27349dfed26017e86ea86e8f326bceb6202edd3c6fbfd24a7099c483c405b8e9"

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
libsfml-network.so.2.6 \
libsfml-system.so.2.6 \
libstdc++.so.6 \
libudev.so.1 \
libusb-1.0.so.0 \
libxxhash.so.0 \
libzstd.so.1 \
nintendo-gamecube-wiimote-udev-rules"

inherit rpm
