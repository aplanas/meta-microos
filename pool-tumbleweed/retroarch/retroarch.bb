SUMMARY = "Emulator frontend"
DESCRIPTION = "RetroArch is a modular multi-system emulator system that is designed to be \
fast, lightweight, and portable. It has features few other emulators frontends \
have, such as real-time rewinding and game-aware shading."
LICENSE = "GPL-3.0-only"

PV = "1.15.0"

RPM_NAME = "retroarch-1.15.0-1.4.aarch64.rpm"
RPM_HASH = "948dad9f4173c4f8b578a5d42d4e07ea4b7881c8bb04d176a4d3ffff77f1f4a1182bf38501d15486d8f81aafad61b9430f1d3ad1abef8cdb15ca62e4ce2b2bf8"

RPROVIDES:${PN} += "config-retroarch \
retroarch"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
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
