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

RPM_NAME = "nsnake-3.0.1-2.16.aarch64.rpm"
RPM_HASH = "76b071b6b7b75fe2446c14b37e78d272990c8f7454a7d78bd5a95c69c8fce525e8d3cfdc2d6750870a6733d6a40c125b9733b9d1981f939f49313290cd0a242c"

RPROVIDES:${PN} += "nsnake"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libncurses.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
