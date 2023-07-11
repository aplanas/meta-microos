SUMMARY = "A computer version of the 15-puzzle and other sliding puzzles"
DESCRIPTION = "Taquin is a computer version of the 15-puzzle and other sliding puzzles. \
 \
The object of Taquin is to move tiles so that they reach their places, \
either indicated with numbers, or with parts of a great image."
LICENSE = "GPL-3.0-or-later"

PV = "3.38.1"

RPM_NAME = "gnome-taquin-3.38.1-2.13.aarch64.rpm"
RPM_HASH = "9313a10dcfaefc7f959a390786c3f7b984ab691549c85f7182ae55045bc5026a05184d389edd1ae1f3c31c33756a954b4a403fbb541abcae344af84f47953718"

RPROVIDES:${PN} += "gnome-taquin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsound.so.0 \
libgtk-3.so.0"

inherit rpm
