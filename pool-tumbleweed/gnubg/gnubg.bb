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

RPROVIDES:${PN} += "gnubg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk.so.0 \
libcanberra.so.0 \
libcurl.so.4 \
libfreetype.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgdkglext-x11-1.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libgtkglext-x11-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libpython3.10.so.1.0 \
libreadline.so.8 \
libsqlite3.so.0"

inherit rpm
