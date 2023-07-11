SUMMARY = "C++ library of various utility functions"
DESCRIPTION = "Claw is a generalist library written in C++ and providing various \
structures (multitype map, AVL binary tree) and algorithms."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.4"

RPM_NAME = "libclaw1-1.7.4-4.11.aarch64.rpm"
RPM_HASH = "a186cc4e4e5eee4fe56b6dd70bf04c2f7d7198cf7c03869179a72231a92d361c023825e6f7b8d7e1eb8d000c0fec01a41bae198b22064f0c95e30593d55c16e6"

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
