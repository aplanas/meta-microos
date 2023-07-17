SUMMARY = "Static libraries for the ncurses5 terminal control library"
DESCRIPTION = "This package contains the static library files for \
the ncurses library in its ABI version 5 form."
LICENSE = "MIT"

PV = "6.4.20230701"

RPM_NAME = "ncurses5-devel-static-6.4.20230701-16.1.aarch64.rpm"
RPM_HASH = "a2ca0629773055fc9ed01456ea512f5f38357553f8685cb96db6dd2f50568db4a5bad552813dc05788bd3b52154d55ee74cb246097b89c57dca2b8c13161c65b"

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
