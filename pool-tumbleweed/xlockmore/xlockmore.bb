SUMMARY = "Screen Saver and Locker for the X Window System"
DESCRIPTION = "The xlock utility locks your X Window System session and runs a screen \
saver until a password is entered."
LICENSE = "MIT"

PV = "5.69"

RPM_NAME = "xlockmore-5.69-3.3.aarch64.rpm"
RPM_HASH = "de23abf640274e5e97c25e24012c7309813e4b47d52bbb9d92d859d7edec64294719c5759dedf306fc2aae067b9872fd4a7a286b7d5dfde3bf59ee5543936088"

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
