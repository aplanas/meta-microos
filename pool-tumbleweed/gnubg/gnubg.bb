SUMMARY = "Backgammon game with analysis tools and neural network AI"
DESCRIPTION = "Program for playing and analysing backgammon positions, games and matches. It is \
based on a neural network. It currently plays at about the level of a \
championship flight tournament player. Depending on its parameters and its luck \
in recent games, it rates from around 1900 to 2000 on FIBS, the First Internet \
Backgammon Server -- at its strongest, it ranks in the top 5 of over 6000 rated \
players there and is gradually improving."
LICENSE = "GPL-3.0-or-later"

PV = "1.06.002"

RPM_NAME = "gnubg-1.06.002-3.4.aarch64.rpm"
RPM_HASH = "e5f2379dccffc875a9d2e344e9e3d33c1f2c31925954fc93419488121a00478290fed0de707f4267e7c971703d49cdf28c00fcd444762146dbc7ebb3b480e51a"

RPROVIDES:${PN} += "application() \
application(gnubg.desktop) \
gnubg \
gnubg(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcanberra-gtk.so.0()(64bit) \
libcanberra.so.0()(64bit) \
libcurl.so.4()(64bit) \
libfreetype.so.6()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgdkglext-x11-1.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmp.so.10()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libgtkglext-x11-1.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpython3.10.so.1.0()(64bit) \
libreadline.so.8()(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
