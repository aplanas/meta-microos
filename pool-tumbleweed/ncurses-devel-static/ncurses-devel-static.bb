SUMMARY = "Static libraries for the ncurses6 terminal control library"
DESCRIPTION = "This package contains the static library files for \
the ncurses library in its ABI version 6 form."
LICENSE = "MIT"

PV = "6.4.20230715"

RPM_NAME = "ncurses-devel-static-6.4.20230715-17.1.aarch64.rpm"
RPM_HASH = "d54d06ff11b4af0d97dc77209d3345b564891c7808145df1f69bac76806ac718568e325441679da1bf77c006cfcb4193ee3016dbbc067951ad655997bb298de2"

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
