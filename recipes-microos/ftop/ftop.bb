SUMMARY = "Open File Monitoring"
DESCRIPTION = "Ftop is to files what top is to processes. The progress of all open files and \
file systems can be monitored. If run as a regular user, the set of open files \
will be limited to those in that user's processes (which is generally all that \
is of interest to the user). In any case, the selection of which files to \
display is possible through a wide assortment of options. As with top, the \
items are displayed in order from most to least active."
LICENSE = "GPL-3.0-only"

PV = "1.0"

RPM_NAME = "ftop-1.0-2.5.aarch64.rpm"
RPM_HASH = "bce3279e006a6218e36251441d4253e48ef4895a64afb137b9473415b1832e58f916d31ceb41d2dafec52dcec1979455c5ca7884d8082727c0844528a8e9ce37"

RPROVIDES:${PN} += "ftop ftop(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libncurses.so.6()(64bit) libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
