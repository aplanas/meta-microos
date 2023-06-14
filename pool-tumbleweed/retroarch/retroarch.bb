SUMMARY = "Emulator frontend"
DESCRIPTION = "RetroArch is a modular multi-system emulator system that is designed to be \
fast, lightweight, and portable. It has features few other emulators frontends \
have, such as real-time rewinding and game-aware shading."
LICENSE = "GPL-3.0-only"

PV = "1.15.0"

RPM_NAME = "retroarch-1.15.0-1.3.aarch64.rpm"
RPM_HASH = "e3efb6db64685b767848f3b5ddf6f17c397577822d1ca848db40e483bc7bb7c975e731ac84b254628f3f96293561d853c7a4ab19a5ba727e5d522a72c39ab717"

RPROVIDES:${PN} += "config-retroarch \
retroarch"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libSDL2-2.0.so.0 \
libX11-xcb.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXv.so.1 \
libXxf86vm.so.1 \
libasound.so.2 \
libass.so.9 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libdbus-1.so.3 \
libdrm.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgbm.so.1 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
libopenal.so.1 \
libpulse.so.0 \
libstdc++.so.6 \
libswresample.so.4 \
libswscale.so.7 \
libudev.so.1 \
libv4l2.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwayland-egl.so.1 \
libxkbcommon.so.0"

inherit rpm
