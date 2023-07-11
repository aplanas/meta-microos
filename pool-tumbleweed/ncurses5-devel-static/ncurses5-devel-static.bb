SUMMARY = "Static libraries for the ncurses5 terminal control library"
DESCRIPTION = "This package contains the static library files for \
the ncurses library in its ABI version 5 form."
LICENSE = "MIT"

PV = "6.4.20230617"

RPM_NAME = "ncurses5-devel-static-6.4.20230617-15.1.aarch64.rpm"
RPM_HASH = "4062f3744c5094160703ffa7ab363d34424a2a2aa8edbb4cf2314eb0f95634de0c3cbefb816fa1c1f90083c5be3369ea74ca21930565355f30e0d999b7f21bc3"

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
