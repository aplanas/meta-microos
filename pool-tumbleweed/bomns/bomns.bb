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

RPM_NAME = "bomns-0.99.3-1.30.aarch64.rpm"
RPM_HASH = "dece3be6b7f22e92dadbd30e55873f6623fb3c682f5a0cfcc0a60fa895702a24b7547e01a0c77e05ad267e8fd050606f53eb504722a9ed0e6d1e0f86ca7faa9f"

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
