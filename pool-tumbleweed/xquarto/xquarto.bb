SUMMARY = "Xquarto is a board game designed for the X windows environment"
DESCRIPTION = "The game is a two-player game. Player 1 chooses one of the 16 pieces. \
Player 2 then places this piece on one of the 16 squares of the board \
and chooses a piece out of the remaining 15 pieces which he gives to \
player 1, who places this piece on one of the remaining 15 squares on \
the board, etc... \
 \
Xquarto supports three different player combinations: human vs \
computer, computer vs human and human vs human (possibly through the \
local network in the latter case). The default combination is human vs \
computer, i.e. the human player starts the game against the computer. \
This can be changed by clicking on the 'Actions' menu (see below for \
more details)."
LICENSE = "GPL-2.0+"

PV = "2.5"

RPM_NAME = "xquarto-2.5-814.23.aarch64.rpm"
RPM_HASH = "390d34de10053d40121f88abc468c74568b0de0f7a30c0fa6d8c3d0849f6b94e102c6787fb73404e7ff83d8ac117b789d25c560dd478ad0fcc5f65ee65d6c8c6"

RPROVIDES:${PN} += "xquarto \
xquarto(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXpm.so.4()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
