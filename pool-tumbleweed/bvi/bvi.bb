SUMMARY = "Editor for binary files"
DESCRIPTION = "The bvi is a display-oriented editor for binary files, based on the vi \
texteditor. If you are familiar with vi, just start the editor and begin to \
edit! A bmore program is also included in the package.  If you never heard \
about vi, maybe bvi is not the best choice for you."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.2"

RPM_NAME = "bvi-1.4.2-1.1.aarch64.rpm"
RPM_HASH = "cd60aaf330b5e2f171155e63af4db8028cad27b6df4028d06ab432bd8c569fd8677e99bc96075fa2a7451799697d452613cb8679be866da03bec7966f1c594da"

RPROVIDES:${PN} += "bvi \
bvi(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
