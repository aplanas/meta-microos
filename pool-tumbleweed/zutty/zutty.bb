SUMMARY = "Terminal program with GLES renderer and low latency"
DESCRIPTION = "An X terminal emulator rendering through OpenGL ES shaders. \
It has good input latency and VTxxx emulation over most other \
terminals, ranging second after xterm (as of 2022). \
It uses FreeType, but does not support fontconfig, thus won't find \
fonts by their usual names. (See FAQ for details.)"
LICENSE = "GPL-3.0-or-later"

PV = "0.14"

RPM_NAME = "zutty-0.14-1.1.aarch64.rpm"
RPM_HASH = "6168351a31c24536f4e1e5db31a0784f36bdfbc8baa4e025c25ff5ffb01a75871b6af989c1b6874a8da1e3d30080234458678f5690eaa37828dc5ef9f9565a78"

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
