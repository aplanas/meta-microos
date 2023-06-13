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

RPROVIDES:${PN} += "application() \
application(dolphin-emu.desktop) \
dolphin-emu \
dolphin-emu(aarch-64)"

RDEPENDS:${PN} += "libEGL.so.1()(64bit) \
libGLX.so.0()(64bit) \
libOpenGL.so.0()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libasound.so.2()(64bit) \
libbluetooth.so.3()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libenet.so.7()(64bit) \
libevdev.so.2()(64bit) \
libevdev.so.2(LIBEVDEV_1)(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
libhidapi-hidraw.so.0()(64bit) \
liblzma.so.5()(64bit) \
liblzo2.so.2()(64bit) \
libm.so.6()(64bit) \
libmbedcrypto.so.7()(64bit) \
libmbedtls.so.14()(64bit) \
libmbedx509.so.1()(64bit) \
libminiupnpc.so.17()(64bit) \
libpugixml.so.1()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libsfml-network.so.2.5()(64bit) \
libsfml-system.so.2.5()(64bit) \
libstdc++.so.6()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libusb-1.0.so.0()(64bit) \
libxxhash.so.0()(64bit) \
libzstd.so.1()(64bit) \
nintendo-gamecube-wiimote-udev-rules"

inherit rpm
