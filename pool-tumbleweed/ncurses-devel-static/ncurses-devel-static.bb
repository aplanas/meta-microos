SUMMARY = "Static libraries for the ncurses6 terminal control library"
DESCRIPTION = "This package contains the static library files for \
the ncurses library in its ABI version 6 form."
LICENSE = "MIT"

PV = "6.4.20230812"

RPM_NAME = "ncurses-devel-static-6.4.20230812-18.1.aarch64.rpm"
RPM_HASH = "b6a6a5d0dee5cc6b86389c51cc698692df4436526d7c813e40cccc1005d178299eb63e99e66905f4e100207709401e4c6d7c57f8c2c8bbdda0720fbec346b684"

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
