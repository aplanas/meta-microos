SUMMARY = "An ADS-B Mode S decoder for RTLSDR devices (Flightaware fork)"
DESCRIPTION = "An ADS-B Mode S decoder specifically designed for RTLSDR devices. \
Flightaware fork."
LICENSE = "GPL-2.0-only"

PV = "8.2"

RPM_NAME = "dump1090-fa-8.2-1.3.aarch64.rpm"
RPM_HASH = "769f48e4f2e4ef54879c86a2d73b1a08652240441cb2667ef1e48dc63d6f42652db9dd279da0f65ec251a910bf71107a87e5587d90cf38d689974c2dc65ebaac"

RPROVIDES:${PN} += "dump1090-fa \
dump1090-fa(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbladeRF.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
librtlsdr.so.0()(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
