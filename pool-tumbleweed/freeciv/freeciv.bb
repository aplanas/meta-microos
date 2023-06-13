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

RPROVIDES:${PN} += "application() \
application(freeciv-manual.desktop) \
application(org.freeciv.ruledit.desktop) \
application(org.freeciv.server.desktop) \
config(freeciv) \
freeciv \
freeciv(aarch-64) \
metainfo() \
metainfo(org.freeciv.ruledit.appdata.xml) \
metainfo(org.freeciv.server.appdata.xml)"

RDEPENDS:${PN} += "/bin/sh \
freeciv_client-3.0.7 \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libicuuc.so.73()(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
