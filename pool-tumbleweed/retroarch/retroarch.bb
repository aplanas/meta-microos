SUMMARY = "Emulator frontend"
DESCRIPTION = "RetroArch is a modular multi-system emulator system that is designed to be \
fast, lightweight, and portable. It has features few other emulators frontends \
have, such as real-time rewinding and game-aware shading."
LICENSE = "GPL-3.0-only"

PV = "1.15.0"

RPM_NAME = "retroarch-1.15.0-1.3.aarch64.rpm"
RPM_HASH = "e3efb6db64685b767848f3b5ddf6f17c397577822d1ca848db40e483bc7bb7c975e731ac84b254628f3f96293561d853c7a4ab19a5ba727e5d522a72c39ab717"

RPROVIDES:${PN} += "application() \
application(retroarch.desktop) \
config(retroarch) \
metainfo() \
metainfo(com.libretro.RetroArch.appdata.xml) \
retroarch \
retroarch(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libEGL.so.1()(64bit) \
libGL.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXv.so.1()(64bit) \
libXxf86vm.so.1()(64bit) \
libasound.so.2()(64bit) \
libass.so.9()(64bit) \
libavcodec.so.60()(64bit) \
libavformat.so.60()(64bit) \
libavutil.so.58()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdrm.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgbm.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libjack.so.0()(64bit) \
libm.so.6()(64bit) \
libopenal.so.1()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libstdc++.so.6()(64bit) \
libswresample.so.4()(64bit) \
libswscale.so.7()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libv4l2.so.0()(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-cursor.so.0()(64bit) \
libwayland-egl.so.1()(64bit) \
libxkbcommon.so.0()(64bit)"

inherit rpm
