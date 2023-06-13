SUMMARY = "A free clone of the original BlockOut DOS game"
DESCRIPTION = "BlockOut II is a free adaptation of the original BlockOut DOS game \
edited by California Dreams in 1989. BlockOut II has the same \
features than the original game with few graphic improvements. The \
game has been designed to reproduce the original game kinematics as \
accurately as possible."
LICENSE = "GPL-2.0-only"

PV = "2.5"

RPM_NAME = "blockout-2.5-2.11.aarch64.rpm"
RPM_HASH = "525608a7c75812ed63f4aef49d38dce8ac88f84ca66cc17550ca4bcc4c7c5127edf3ca35ec4b2d3d0ddcd3f45c7a3690eb8078e4cebd1addc1f1d64556eb4b8b"

RPROVIDES:${PN} += "blockout \
blockout(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
