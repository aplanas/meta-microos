SUMMARY = "Blue Moon card solitaire"
DESCRIPTION = "bluemoon - Blue Moon card solitaire \
 \
This 52-card solitaire starts with the entire deck shuffled and \
dealt out in four rows. The aces are then moved to the left end of \
the layout, making 4 initial free spaces. You may move to a space \
only the card that matches the left neighbor in suit, and is one \
greater in rank. Kings are high, so no cards may be placed to their \
right (they create dead spaces). \
 \
When no moves can be made, cards still out of sequence are reshuffled \
and dealt face up after the ends of the partial sequences, leaving \
a card space after each sequence, so that each row looks like a \
partial sequence followed by a space, followed by enough cards to \
make a row of 14. A moment's reflection will show that this game \
cannot take more than 13 deals. A good score is 1-3 deals, 4-7 is \
average, 8 or more is poor."
LICENSE = "BSD-3-Clause"

PV = "2.12"

RPM_NAME = "bluemoon-2.12-1.26.aarch64.rpm"
RPM_HASH = "aec1ce4e297981f50497af5af6f512ce5650b1bb442ed9e6815a1a7877391e7cb013a2fd8d0db39435edcdb0feb32190f294f92fb13a65f494a3140138824754"

RPROVIDES:${PN} += "application() \
application(bluemoon.desktop) \
bluemoon \
bluemoon(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
