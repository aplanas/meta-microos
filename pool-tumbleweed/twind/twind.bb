SUMMARY = "Match and remove all of the blocks before time runs out"
DESCRIPTION = "The object of the game is to remove all of the blocks from the screen \
before the time runs out. Two blocks are removed at a time, \
and must be of the same color. After completing a level, \
you will be rewarded with a bonus point for every tick left on the clock. \
For each level thereafter, the time to complete the the level will be shorter. \
 \
Shortcut Keys Used During the Game \
 \
 b - change the block set \
 c - change the corner style of the blocks \
 f, F4 - toggle between full screen/window mode (can be used anywhere) \
 h, F1 - display the help screen \
 m - turn background music on/off (can be used anywhere) \
 n, F2 - start a new game (highscores won't be saved ending a game this way) \
 p, Pause, F3 - pause/unpause the game \
 q, Esc - quit the game \
 s - turn sound effects on/off (can be used anywhere) \
 0 - 9 - toggle the L & R colors on Insane mode (can be used anywhere)"
LICENSE = "GPL-2.0"

PV = "1.1.0"

RPM_NAME = "twind-1.1.0-3.26.aarch64.rpm"
RPM_HASH = "3918ffe647ca4335b2fe4580a947031cf2e08aa2546a9d837f1716fcd11e60aadc9af7cd94fdc42274b348a18412c43caadbb746d5ca43ca545f42d3ced58cbd"

RPROVIDES:${PN} += "application() \
application(twind.desktop) \
twind \
twind(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_image-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
