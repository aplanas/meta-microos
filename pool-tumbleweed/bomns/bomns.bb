SUMMARY = "Best old-school Deathmatch game ever (only for two players)"
DESCRIPTION = "The gameplay of Bomns for Linux is quite simple: just move around the level, \
picking up powerups and avoiding powerdowns, all the while laying bomns and \
plotting your opponent's desctruction. A bomn will do 5 damage to the other \
player, and running into them will do 1 damage. The first to kill their \
opponent before the time runs out is declared the winner. \
 \
Player one controls: \
  Move      : arrow keys \
  Drop Bomn : enter \
 \
Player two controls: \
  Move      : w,a,s,d \
  Drop Bomn : spacebar \
 \
Other controls: \
  Enter/exit fullscreen mode: f \
  Quit current game         : escape"
LICENSE = "GPL-2.0+"

PV = "0.99.3"

RPM_NAME = "bomns-0.99.3-1.31.aarch64.rpm"
RPM_HASH = "12d2f924ca212d27b0d2844e3f24d90b16a3d8677fa673fca216f70327c55c4d15c8c48ed39f2cb38e40818418f89cead161e5c1e9f7df07294ca20d40c59774"

RPROVIDES:${PN} += "bomns"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libatk-1.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libstdc++.so.6"

inherit rpm
