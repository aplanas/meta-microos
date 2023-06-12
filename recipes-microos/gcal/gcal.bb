SUMMARY = "A Program for Printing Calendars"
DESCRIPTION = "Gcal is a program for printing calendars.  Gcal displays a calendar for \
a month or a year, eternal holiday lists, and fixed date lists.  The \
program correctly omits the dates that were skipped when the current \
Gregorian calendar replaced the earlier Julian calendar."
LICENSE = "GPL-3.0-or-later"

PV = "4.1"

RPM_NAME = "gcal-4.1-3.4.aarch64.rpm"
RPM_HASH = "8cd1ad795f17623520cf105c99d03fedaeedbd01482d15cd2d1a744bc10b672a011a8acaf5053f98fd2c37d4cc4108da696d365775725e8bd0d0b58e26cdbcce"

RPROVIDES:${PN} += "gcal \
gcal(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
