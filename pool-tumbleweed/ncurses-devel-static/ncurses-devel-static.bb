SUMMARY = "Static libraries for the ncurses6 terminal control library"
DESCRIPTION = "This package contains the static library files for \
the ncurses library in its ABI version 6 form."
LICENSE = "MIT"

PV = "6.4.20230520"

RPM_NAME = "ncurses-devel-static-6.4.20230520-13.1.aarch64.rpm"
RPM_HASH = "f67545261425f0594c829815719ecb93f76cba44dbd34e6788b19bd3a1bbcb6da3bebe514f310dc3518c98d5ee4acfd04a0fcf1602cb3dfdc73fea95938e0721"

RPROVIDES:${PN} += "ncurses-devel-static \
ncurses-devel-static(aarch-64) \
ncurses-devel:/usr/lib64/libform.a \
ncurses-devel:/usr/lib64/libformw.a \
ncurses-devel:/usr/lib64/libmenu.a \
ncurses-devel:/usr/lib64/libmenuw.a \
ncurses-devel:/usr/lib64/libncurses++.a \
ncurses-devel:/usr/lib64/libncurses++w.a \
ncurses-devel:/usr/lib64/libncurses.a \
ncurses-devel:/usr/lib64/libncursesw.a \
ncurses-devel:/usr/lib64/libpanel.a \
ncurses-devel:/usr/lib64/libpanelw.a \
ncurses-devel:/usr/lib64/libtic.a \
ncurses-devel:/usr/lib64/libticw.a \
ncurses-devel:/usr/lib64/libtinfo.a"

RDEPENDS:${PN} += "ncurses-devel"

inherit rpm
