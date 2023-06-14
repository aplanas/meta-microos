SUMMARY = "An action-puzzle game involving bouncing penguins"
DESCRIPTION = "IceBreaker is an action-puzzle game in which the player must section \
off level space, preferably in the least amount of time with the \
least amount of mistakes. IceBreaker was inspired by (but is far from \
an exact clone of) the 1992 game Jezzball by Dima Pavlovsky, itself \
having similarities to the 1981 game of Qix."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.1"

RPM_NAME = "icebreaker-2.2.1-2.6.aarch64.rpm"
RPM_HASH = "000479b8e500f2035408610ff4200d5afb69a80388704273dccbf47a54a9bf8e56f406894d0b780cd8900d60c247f041cf529625d8a2e6b8213a33b025e2dedf"

RPROVIDES:${PN} += "icebreaker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6"

inherit rpm
