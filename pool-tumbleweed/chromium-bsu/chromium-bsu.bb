SUMMARY = "Vertical Scrolling Space Shooter Game"
DESCRIPTION = "Chromium B.S.U. is a fast paced, arcade-style, top-scrolling space shooter. \
 \
You are captain of the cargo ship Chromium B.S.U., responsible for \
delivering supplies to our troops on the front line. Your ship has \
a small fleet of robotic fighters which you control from the relative \
safety of the Chromium vessel."
LICENSE = "ClArtistic & MIT"

PV = "0.9.16.1"

RPM_NAME = "chromium-bsu-0.9.16.1-1.19.aarch64.rpm"
RPM_HASH = "a6e06c0ba66f35418021f1c47e8c5c6ddf8d6faef591f41a0dcddc111cfa4f5b3050684d72ecee80933d7178e4a4328758faf6b788f1c15fb932b54a4d74c1a8"

RPROVIDES:${PN} += "chromium-bsu \
config-chromium-bsu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLC.so.0 \
libGLU.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libalut.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libstdc++.so.6"

inherit rpm
