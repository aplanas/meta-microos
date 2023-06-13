SUMMARY = "Static libraries for the ncurses5 terminal control library"
DESCRIPTION = "This package contains the static library files for \
the ncurses library in its ABI version 5 form."
LICENSE = "MIT"

PV = "6.4.20230520"

RPM_NAME = "ncurses5-devel-static-6.4.20230520-13.1.aarch64.rpm"
RPM_HASH = "5dfb713e8a76b00759f4c4fc698f0d1c057eddaab4bc564afb44aabb9b3f575b24a294e672ba36880333d7f8eee6ba6440cc6b4783fcffda4e0e734123823da3"

RPROVIDES:${PN} += "ncurses5-devel-static \
ncurses5-devel-static(aarch-64) \
ncurses5-devel:/usr/lib64/ncurses5/libform.a \
ncurses5-devel:/usr/lib64/ncurses5/libformw.a \
ncurses5-devel:/usr/lib64/ncurses5/libmenu.a \
ncurses5-devel:/usr/lib64/ncurses5/libmenuw.a \
ncurses5-devel:/usr/lib64/ncurses5/libncurses++.a \
ncurses5-devel:/usr/lib64/ncurses5/libncurses++w.a \
ncurses5-devel:/usr/lib64/ncurses5/libncurses.a \
ncurses5-devel:/usr/lib64/ncurses5/libncursesw.a \
ncurses5-devel:/usr/lib64/ncurses5/libpanel.a \
ncurses5-devel:/usr/lib64/ncurses5/libpanelw.a \
ncurses5-devel:/usr/lib64/ncurses5/libtic.a \
ncurses5-devel:/usr/lib64/ncurses5/libticw.a \
ncurses5-devel:/usr/lib64/ncurses5/libtinfo.a"

RDEPENDS:${PN} += "ncurses5-devel"

inherit rpm
