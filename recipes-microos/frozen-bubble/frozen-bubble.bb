SUMMARY = "Puzzle with Bubbles"
DESCRIPTION = "Shoot up bubbles. Similar to the console game Puzzle-Bobble. \
 \
Colorful 3D rendered penguin animations, 100 levels of 1p game, hours and \
hours of 2p game, nights and nights of 2p/3p/4p/5p game over LAN or Internet, \
a level-editor, 3 professional quality digital soundtracks, 15 stereo sound \
effects, 8 unique graphical transition effects, 8 unique logo eye-candies."
LICENSE = "GPL-2.0-or-later"

PV = "2.212"

RPM_NAME = "frozen-bubble-2.212-15.3.aarch64.rpm"
RPM_HASH = "f2b68b2d75a4756cc8437d7130d0c1648aec63e5f8312081eb838db5377cd41edba892f3e55f2921e92a3f543b3edb280a6bd50ed87edf04766bbe7ee0685dda"

RPROVIDES:${PN} += "application() \
application(frozen-bubble.desktop) \
frozen-bubble \
frozen-bubble(aarch-64) \
metainfo() \
metainfo(frozen-bubble.appdata.xml) \
perl(Games::FrozenBubble) \
perl(Games::FrozenBubble::CStuff) \
perl(Games::FrozenBubble::Config) \
perl(Games::FrozenBubble::LevelEditor) \
perl(Games::FrozenBubble::MDKCommon) \
perl(Games::FrozenBubble::Net) \
perl(Games::FrozenBubble::NetDiscover) \
perl(Games::FrozenBubble::Stuff) \
perl(Games::FrozenBubble::Symbols)"
RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/touch \
fillup \
frozen-bubble-server \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
net-tools \
perl \
perl(Alien::SDL) \
perl(Compress::Bzip2) \
perl(Locale::Maketext::Lexicon) \
perl(Locale::Maketext::Simple) \
perl(Tie::Simple) \
perl-SDL"

inherit rpm
