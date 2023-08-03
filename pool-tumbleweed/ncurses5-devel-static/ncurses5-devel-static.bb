SUMMARY = "Static libraries for the ncurses5 terminal control library"
DESCRIPTION = "This package contains the static library files for \
the ncurses library in its ABI version 5 form."
LICENSE = "MIT"

PV = "6.4.20230715"

RPM_NAME = "ncurses5-devel-static-6.4.20230715-17.1.aarch64.rpm"
RPM_HASH = "27ab5bf08f9ad8a7a4a8923c9c4783925b2a66f535222d20840f44f1a647cb51593040cf51f2ffb78126ef3ba6933e6f37eb31ecf98500bc2345e6e9f80db4a7"

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
