SUMMARY = "Utility programs making use of libcdio, a CD-ROM access library"
DESCRIPTION = "This package contains a number of utility programs that make use of \
libcdio."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "cdio-utils-2.1.0-7.1.aarch64.rpm"
RPM_HASH = "13481a04d9c2cb03b122a22181b99057d1d420416094e54abfe3743d442084655fa7c32ae498880de8bc3ca904638b1ef18d6d271114972d91dd01f7e79d1554"

RPROVIDES:${PN} += "cdio-utils cdio-utils(aarch-64) libcdio-utils"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcddb.so.2()(64bit) libcdio.so.19()(64bit) libcdio.so.19(CDIO_19)(64bit) libiso9660.so.11()(64bit) libiso9660.so.11(ISO9660_11)(64bit) libncurses.so.6()(64bit) libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libudf.so.0()(64bit) libvcdinfo.so.0()(64bit) libvcdinfo.so.0(VCDINFO_0)(64bit)"

inherit rpm
