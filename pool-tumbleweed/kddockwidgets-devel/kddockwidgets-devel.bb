SUMMARY = "Development files for libkddockwidgets"
DESCRIPTION = "Development files for libkddockwidgets"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "kddockwidgets-devel-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "04e837a9bf3cd4d0436577f37a3e6430c1d3511deeafbe2f82356b5cdcad80770a8b911aab898efc0a188ea221cf351de387e12eb622539f548dc034d9c7a147"

RPROVIDES:${PN} += "cmake-KDDockWidgets \
kddockwidgets-devel"

RDEPENDS:${PN} += "cmake-Qt5X11Extras \
libkddockwidgets1-7"

inherit rpm
