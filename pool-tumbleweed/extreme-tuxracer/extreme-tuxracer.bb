SUMMARY = "Racing game featuring Tux the Linux Penguin"
DESCRIPTION = "Extreme Tux Racer is a racing game featuring Tux \
the Linux Penguin. Extreme Tux Racer continues in the tracks \
of Tux Racer and its forks."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.2"

RPM_NAME = "extreme-tuxracer-0.8.2-1.6.aarch64.rpm"
RPM_HASH = "7b83ebc1936f11223b50bffce102cf0e5707f37c12a5c06506fda7f2a15ee09e8e2f70872ba69e5ddf9e3cacf75629d87e2e31c8d8bcd0b3920c2fd12207f05d"

RPROVIDES:${PN} += "extreme-tuxracer"

RDEPENDS:${PN} += "extreme-tuxracer-data \
ld-linux-aarch64.so.1 \
libGLU.so.1 \
libOpenGL.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsfml-audio.so.2.6 \
libsfml-graphics.so.2.6 \
libsfml-system.so.2.6 \
libsfml-window.so.2.6 \
libstdc++.so.6"

inherit rpm
