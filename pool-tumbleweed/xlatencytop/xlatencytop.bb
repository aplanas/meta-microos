SUMMARY = "Kernel latency measuring tool"
DESCRIPTION = "LatencyTOP is a Linux* tool for software developers (both kernel and \
userspace), aimed at identifying where in the system latency is \
happening, and what kind of operation/action is causing the latency to \
happen so that the code can be changed to avoid the worst latency \
hiccups. This package contains version with graphic interface."
LICENSE = "GPL-2.0"

PV = "0.5"

RPM_NAME = "xlatencytop-0.5-25.24.aarch64.rpm"
RPM_HASH = "e24eabf9c5c95496c999608d765a4d3b1771edae79c4fdd7930ab41e70465e4fb52e027cc1b4bc4999fd81aeaa505d9b35cc634927e01529fbd4a1267eaadb8b"

RPROVIDES:${PN} += "xlatencytop \
xlatencytop(aarch-64)"

RDEPENDS:${PN} += "latencytop \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
