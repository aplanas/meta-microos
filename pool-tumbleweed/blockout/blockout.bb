SUMMARY = "A free clone of the original BlockOut DOS game"
DESCRIPTION = "BlockOut II is a free adaptation of the original BlockOut DOS game \
edited by California Dreams in 1989. BlockOut II has the same \
features than the original game with few graphic improvements. The \
game has been designed to reproduce the original game kinematics as \
accurately as possible."
LICENSE = "GPL-2.0-only"

PV = "2.5"

RPM_NAME = "blockout-2.5-2.12.aarch64.rpm"
RPM_HASH = "99b589495a47f7bdf918918c0a9fb3b71c4f5a3116376a85d93a8b50700b4c50649b13eae7ce774b1778cd45d5f29449df1f09e99c8d1149a51d83ab4464edb3"

RPROVIDES:${PN} += "blockout"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libSDL-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
