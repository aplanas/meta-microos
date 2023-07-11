SUMMARY = "Terminal program with GLES renderer and low latency"
DESCRIPTION = "An X terminal emulator rendering through OpenGL ES shaders. \
It has good input latency and VTxxx emulation over most other \
terminals, ranging second after xterm (as of 2022). \
It uses FreeType, but does not support fontconfig, thus won't find \
fonts by their usual names. (See FAQ for details.)"
LICENSE = "GPL-3.0-or-later"

PV = "0.14"

RPM_NAME = "zutty-0.14-1.2.aarch64.rpm"
RPM_HASH = "ab2b517bfa2583c0139fa9b394ea0c65644eb1d6d1b6f615eb2e2d0c77eb9404e42223096be639a59681d169a656393490a33095b04bd6e747c48b6a001745fd"

RPROVIDES:${PN} += "zutty"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libX11.so.6 \
libXmu.so.6 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
