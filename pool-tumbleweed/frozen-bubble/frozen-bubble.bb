SUMMARY = "Puzzle with Bubbles"
DESCRIPTION = "Shoot up bubbles. Similar to the console game Puzzle-Bobble. \
 \
Colorful 3D rendered penguin animations, 100 levels of 1p game, hours and \
hours of 2p game, nights and nights of 2p/3p/4p/5p game over LAN or Internet, \
a level-editor, 3 professional quality digital soundtracks, 15 stereo sound \
effects, 8 unique graphical transition effects, 8 unique logo eye-candies."
LICENSE = "GPL-2.0-or-later"

PV = "2.212"

RPM_NAME = "frozen-bubble-2.212-15.5.aarch64.rpm"
RPM_HASH = "147be7671db6b9b64a0de69b917a34428158000dda7bb2da8632bb9663f3db0215f135a183537ee2a4aa9bdbcc3916a2076ec3191d38e45041ad7888e1e3b087"

RPROVIDES:${PN} += "frozen-bubble \
perl-Games--FrozenBubble \
perl-Games--FrozenBubble--CStuff \
perl-Games--FrozenBubble--Config \
perl-Games--FrozenBubble--LevelEditor \
perl-Games--FrozenBubble--MDKCommon \
perl-Games--FrozenBubble--Net \
perl-Games--FrozenBubble--NetDiscover \
perl-Games--FrozenBubble--Stuff \
perl-Games--FrozenBubble--Symbols"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/touch \
fillup \
frozen-bubble-server \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
net-tools \
perl \
perl-Alien--SDL \
perl-Compress--Bzip2 \
perl-Locale--Maketext--Lexicon \
perl-Locale--Maketext--Simple \
perl-SDL \
perl-Tie--Simple"

inherit rpm
