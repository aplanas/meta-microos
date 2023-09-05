SUMMARY = "Static libraries for the ncurses5 terminal control library"
DESCRIPTION = "This package contains the static library files for \
the ncurses library in its ABI version 5 form."
LICENSE = "MIT"

PV = "6.4.20230819"

RPM_NAME = "ncurses5-devel-static-6.4.20230819-19.1.aarch64.rpm"
RPM_HASH = "165e311c1c80d7758d621ddd03f174d72255aee39b2f807a795b34591dd8f0d89f1d7ffa609da57d7a921e4b11578bb858628260e9ecc86674b34d7733e1519c"

RPROVIDES:${PN} += "ncurses5-devel-/usr/lib64/ncurses5/libform.a \
ncurses5-devel-/usr/lib64/ncurses5/libformw.a \
ncurses5-devel-/usr/lib64/ncurses5/libmenu.a \
ncurses5-devel-/usr/lib64/ncurses5/libmenuw.a \
ncurses5-devel-/usr/lib64/ncurses5/libncurses++.a \
ncurses5-devel-/usr/lib64/ncurses5/libncurses++w.a \
ncurses5-devel-/usr/lib64/ncurses5/libncurses.a \
ncurses5-devel-/usr/lib64/ncurses5/libncursesw.a \
ncurses5-devel-/usr/lib64/ncurses5/libpanel.a \
ncurses5-devel-/usr/lib64/ncurses5/libpanelw.a \
ncurses5-devel-/usr/lib64/ncurses5/libtic.a \
ncurses5-devel-/usr/lib64/ncurses5/libticw.a \
ncurses5-devel-/usr/lib64/ncurses5/libtinfo.a \
ncurses5-devel-static"

RDEPENDS:${PN} += "ncurses5-devel"

inherit rpm
