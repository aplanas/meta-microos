SUMMARY = "Static libraries for the ncurses6 terminal control library"
DESCRIPTION = "This package contains the static library files for \
the ncurses library in its ABI version 6 form."
LICENSE = "MIT"

PV = "6.4.20230701"

RPM_NAME = "ncurses-devel-static-6.4.20230701-16.1.aarch64.rpm"
RPM_HASH = "ef65b8184ce63d284f27bb7ed94deaf5b3fce756dd0a9199436236567a3249557660f866f39626c86ebaf28ea336ed351df7cb844f774e7ca299b86a4a9ecd62"

RPROVIDES:${PN} += "ncurses-devel-/usr/lib64/libform.a \
ncurses-devel-/usr/lib64/libformw.a \
ncurses-devel-/usr/lib64/libmenu.a \
ncurses-devel-/usr/lib64/libmenuw.a \
ncurses-devel-/usr/lib64/libncurses++.a \
ncurses-devel-/usr/lib64/libncurses++w.a \
ncurses-devel-/usr/lib64/libncurses.a \
ncurses-devel-/usr/lib64/libncursesw.a \
ncurses-devel-/usr/lib64/libpanel.a \
ncurses-devel-/usr/lib64/libpanelw.a \
ncurses-devel-/usr/lib64/libtic.a \
ncurses-devel-/usr/lib64/libticw.a \
ncurses-devel-/usr/lib64/libtinfo.a \
ncurses-devel-static"

RDEPENDS:${PN} += "ncurses-devel"

inherit rpm
