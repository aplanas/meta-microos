SUMMARY = "C++ library of various utility functions"
DESCRIPTION = "Claw is a generalist library written in C++ and providing various \
structures (multitype map, AVL binary tree) and algorithms."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.4"

RPM_NAME = "libclaw1-1.7.4-4.10.aarch64.rpm"
RPM_HASH = "e9df3b0721548f2d35f8ad7cc003adcc886c4898986dbe536015019fad75c061b701c4db861a3c0525116e67ada73d879a2086ee034d390a07ae7e4dfb7d99f8"

RPROVIDES:${PN} += "libclaw-application.so.1 \
libclaw-configuration-file.so.1 \
libclaw-dynamic-library.so.1 \
libclaw-graphic.so.1 \
libclaw-logger.so.1 \
libclaw-net.so.1 \
libclaw-tween.so.1 \
libclaw1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
