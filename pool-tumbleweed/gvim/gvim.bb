SUMMARY = "A GUI for Vi"
DESCRIPTION = "Package gvim contains the largest set of features of vim, which is \
graphical windows and language interpreter, like python, ruby, or perl. \
You need package vim for the help and other documentation too. If you \
want less features, you might want to install vim instead."
LICENSE = "Vim"

PV = "9.0.1632"

RPM_NAME = "gvim-9.0.1632-2.1.aarch64.rpm"
RPM_HASH = "c4325b18453b12a25ab639c05e40ab3799f4636b35f88122f364ea8dbd2d9ff12236c1f60751c67651ce1767e4dfea3f16f08b3a31bcf9f9240c1d640a1578b4"

RPROVIDES:${PN} += "config-gvim \
gvim \
gvim-base \
gvim-client \
gvim-enhanced \
vi \
vim-client"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXt.so.6 \
libacl.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpm.so.2 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libperl.so \
libselinux.so.1 \
libtinfo.so.6 \
vim-data \
xxd"

inherit rpm
