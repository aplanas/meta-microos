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

PV = "3.0.8"

RPM_NAME = "freeciv-3.0.8-1.1.aarch64.rpm"
RPM_HASH = "09f4d0bb0c0beb12918a8e3b8a0156e38225747ee4dabf1a7a7829aba0a4b577546cbede4c1811f5ce56c9a2405086716abe22acb08b2a3bf7acee50255ac747"

RPROVIDES:${PN} += "config-freeciv \
freeciv"

RDEPENDS:${PN} += "/usr/bin/sh \
freeciv-client-3.0.8 \
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
