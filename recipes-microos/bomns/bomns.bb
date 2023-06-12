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

RPROVIDES:${PN} += "application() \
application(bomns.desktop) \
bomns \
bomns(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
