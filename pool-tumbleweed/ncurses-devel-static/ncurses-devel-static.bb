SUMMARY = "Static libraries for the ncurses6 terminal control library"
DESCRIPTION = "This package contains the static library files for \
the ncurses library in its ABI version 6 form."
LICENSE = "MIT"

PV = "6.4.20230819"

RPM_NAME = "ncurses-devel-static-6.4.20230819-19.1.aarch64.rpm"
RPM_HASH = "fe79842dc073977913476f30d741ec92b00cb1d533228974522bd4a811dae041099a2ff2f3bf5dcb44bd633e6a502ca4ed8d4fc39d6c495cff886c97f15ecf8b"

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
