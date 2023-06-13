SUMMARY = "C++ library of various utility functions"
DESCRIPTION = "Claw is a generalist library written in C++ and providing various \
structures (multitype map, AVL binary tree) and algorithms."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.4"

RPM_NAME = "libclaw1-1.7.4-4.10.aarch64.rpm"
RPM_HASH = "e9df3b0721548f2d35f8ad7cc003adcc886c4898986dbe536015019fad75c061b701c4db861a3c0525116e67ada73d879a2086ee034d390a07ae7e4dfb7d99f8"

RPROVIDES:${PN} += "libclaw1 \
libclaw1(aarch-64) \
libclaw_application.so.1()(64bit) \
libclaw_configuration_file.so.1()(64bit) \
libclaw_dynamic_library.so.1()(64bit) \
libclaw_graphic.so.1()(64bit) \
libclaw_logger.so.1()(64bit) \
libclaw_net.so.1()(64bit) \
libclaw_tween.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
