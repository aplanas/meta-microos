SUMMARY = "Static libraries for the ncurses5 terminal control library"
DESCRIPTION = "This package contains the static library files for \
the ncurses library in its ABI version 5 form."
LICENSE = "MIT"

PV = "6.4.20230812"

RPM_NAME = "ncurses5-devel-static-6.4.20230812-18.1.aarch64.rpm"
RPM_HASH = "fd32f2749b892ce899a4ab07fe036017563e8c8d8b874bd787b522fd65cb887431ce3b5817abe2f61c9b877618051d2d2cfa59ad3f4a8ce2e8b61b45a357f5be"

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
