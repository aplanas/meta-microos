SUMMARY = "Racing game featuring Tux the Linux Penguin"
DESCRIPTION = "Extreme Tux Racer is a racing game featuring Tux \
the Linux Penguin. Extreme Tux Racer continues in the tracks \
of Tux Racer and its forks."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.2"

RPM_NAME = "extreme-tuxracer-0.8.2-1.4.aarch64.rpm"
RPM_HASH = "b82e0106ccc233ccf84ca04126b30b196bf113152047c7f818a13687ba3da5c353348fe5df4bf07206885b151c41402236ff952003fe7f368a45627fc629f421"

RPROVIDES:${PN} += "extreme-tuxracer"

RDEPENDS:${PN} += "extreme-tuxracer-data \
ld-linux-aarch64.so.1 \
libGLU.so.1 \
libOpenGL.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsfml-audio.so.2.5 \
libsfml-graphics.so.2.5 \
libsfml-system.so.2.5 \
libsfml-window.so.2.5 \
libstdc++.so.6"

inherit rpm
