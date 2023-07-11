SUMMARY = "Static libraries for the ncurses6 terminal control library"
DESCRIPTION = "This package contains the static library files for \
the ncurses library in its ABI version 6 form."
LICENSE = "MIT"

PV = "6.4.20230617"

RPM_NAME = "ncurses-devel-static-6.4.20230617-15.1.aarch64.rpm"
RPM_HASH = "dc572c3bdeda9842c61180600f674cc9586de8f0e5142ecd78cc08aefb00f74368e4cee75d9d19ae80b0a10260817b220af905c34a6bff6b7d1631f9aab6d1c7"

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
