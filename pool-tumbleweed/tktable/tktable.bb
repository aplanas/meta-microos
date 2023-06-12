SUMMARY = "A Table/Matrix Widget Extension to Tcl/Tk"
DESCRIPTION = "The basic features of the widgets are: \
 \
* multi-line cells \
 \
* support for embedded windows (one per cell) \
 \
* row & column spanning \
 \
* variable width/height columns/rows (interactively re-sizable) \
 \
* row and column titles \
 \
* multiple data sources ((Tcl array || Tcl command) &| internal \
   caching) \
 \
* supports standard Tk reliefs, fonts, colors, etc. \
 \
* x/y scrollbar support \
 \
* 'tag' styles per row, column or cell to change visual appearance \
 \
* in-cell editing - returns value back to data source \
 \
* support for disabled (read-only) tables or cells (via tags) \
 \
* multiple selection modes, with 'active' cell \
 \
* multiple drawing modes to get optimal performance for larger \
   tables \
 \
* optional 'flashes' when things update \
 \
* cell validation support \
 \
* works everywhere Tk does (including Windows and Mac!) \
 \
* unicode support (Tk8.1+) \
 \
 \
 \
Authors: \
-------- \
    Jeffrey Hobbs <jeff.hobbs@acm.org>"
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "tktable-2.10-6.18.aarch64.rpm"
RPM_HASH = "5badabcbe020d0750b8c0f19524a05bb07e2300a69a78e5af126ba6174ce7d0ce0c41e5c1784806176ee2b4c261c0c3d6198fa26e94ca003982b30cd1ff99421"

RPROVIDES:${PN} += "libTktable2.10.so()(64bit) \
tktable \
tktable(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
tcl \
tk"

inherit rpm
