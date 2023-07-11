SUMMARY = "Classic snake game on the terminal"
DESCRIPTION = "nsnake is a clone of the classic snake game that we all used to play on our \
cellphones. You play this game on the terminal, with textual interface. \
 \
Here are some features: \
 \
- Customizable gameplay, appearance and keybindings \
- Neat GUI-like interface with nice animations \
- Lots of possible game modes, with scores saved for eac"
LICENSE = "GPL-3.0-only"

PV = "3.0.1"

RPM_NAME = "nsnake-3.0.1-2.17.aarch64.rpm"
RPM_HASH = "6637fc2c3dd1d583ec4ca7881d7e16fb8680456d8e8a365645e458ff9402e9d3cd2ab34277ea825e830321a131e3a0de1613db5df58f34a8252ee1457140b606"

RPROVIDES:${PN} += "nsnake"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libncurses.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
