SUMMARY = "Racing game featuring Tux the Linux Penguin"
DESCRIPTION = "Extreme Tux Racer is a racing game featuring Tux \
the Linux Penguin. Extreme Tux Racer continues in the tracks \
of Tux Racer and its forks."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.2"

RPM_NAME = "extreme-tuxracer-0.8.2-1.4.aarch64.rpm"
RPM_HASH = "b82e0106ccc233ccf84ca04126b30b196bf113152047c7f818a13687ba3da5c353348fe5df4bf07206885b151c41402236ff952003fe7f368a45627fc629f421"

RPROVIDES:${PN} += "application() \
application(etr.desktop) \
extreme-tuxracer \
extreme-tuxracer(aarch-64) \
metainfo() \
metainfo(etr.appdata.xml)"

RDEPENDS:${PN} += "extreme-tuxracer-data \
ld-linux-aarch64.so.1()(64bit) \
libGLU.so.1()(64bit) \
libOpenGL.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libsfml-audio.so.2.5()(64bit) \
libsfml-graphics.so.2.5()(64bit) \
libsfml-system.so.2.5()(64bit) \
libsfml-window.so.2.5()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
