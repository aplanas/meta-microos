SUMMARY = "Backgammon game with analysis tools and neural network AI"
DESCRIPTION = "Program for playing and analysing backgammon positions, games and matches. It is \
based on a neural network. It currently plays at about the level of a \
championship flight tournament player. Depending on its parameters and its luck \
in recent games, it rates from around 1900 to 2000 on FIBS, the First Internet \
Backgammon Server -- at its strongest, it ranks in the top 5 of over 6000 rated \
players there and is gradually improving."
LICENSE = "GPL-3.0-or-later"

PV = "1.06.002"

RPM_NAME = "gnubg-1.06.002-3.5.aarch64.rpm"
RPM_HASH = "478ce338fdbdfc253edd74b01a629f5725dc10283f4e472fff69fb63d84651307721334f8e8236f4de147992ea7a706469c94eeb07f9e7cca578f04b73941d7c"

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
libpython3.11.so.1.0 \
libreadline.so.8 \
libsqlite3.so.0"

inherit rpm
