SUMMARY = "Interactive memory/page monitoring tool"
DESCRIPTION = "pagemon is a ncurses based interactive memory/page monitoring tool \
allowing one to browse the memory map of an active running process \
on Linux."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.01"

RPM_NAME = "pagemon-0.02.01-1.2.aarch64.rpm"
RPM_HASH = "360196e669f765a77f0042dacae7f183cd5f912c5e0312e9641a4df2bcb7aedafa3ccc36f212666ab458526e36bc821dc834c1ca13a4f1bc0620b40ed3d4a32b"

RPROVIDES:${PN} += "pagemon \
pagemon(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
