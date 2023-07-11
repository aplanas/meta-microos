SUMMARY = "Screen Saver and Locker for the X Window System"
DESCRIPTION = "The xlock utility locks your X Window System session and runs a screen \
saver until a password is entered."
LICENSE = "MIT"

PV = "5.71"

RPM_NAME = "xlockmore-5.71-1.1.aarch64.rpm"
RPM_HASH = "5b9c56ce1308338ca6cdfff3df3298acc0a6e7d3e0916a1ce05e23054cf731c11488e4340d8babed16f21662db869b7b68fa2ce3e4107f96c850d63e26d8987a"

RPROVIDES:${PN} += "xlockmore"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXpm.so.4 \
libc.so.6 \
libftgl.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libpam.so.0 \
libstdc++.so.6"

inherit rpm
