SUMMARY = "Free Civilization Clone"
DESCRIPTION = "A clone of the well known game Civilization by Microprose. \
 \
Every player is the leader of an imaginary nation. The aim of the game \
can be to create a prospering civilization with commerce and knowledge \
exchange or (more often) the extinction of all other civilizations. \
 \
To start a new game, first start the server 'civserver,' then start the \
client 'civclient'. Have fun!"
LICENSE = "GPL-2.0-or-later"

PV = "3.0.7"

RPM_NAME = "freeciv-3.0.7-1.2.aarch64.rpm"
RPM_HASH = "4ef48f4bbb2ffbed1b4021db4913641fb5057a490fc53ff5bf69538387ecffaf94127f262a97fbb89c44338273d60825cf2cc4203ccee4a1336292c08afdb979"

RPROVIDES:${PN} += "config-freeciv \
freeciv"

RDEPENDS:${PN} += "/usr/bin/sh \
freeciv-client-3.0.7 \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libbz2.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libicuuc.so.73 \
liblzma.so.5 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
