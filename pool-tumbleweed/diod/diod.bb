SUMMARY = "Distributed I/O Daemon - a 9P file server"
DESCRIPTION = "This package contains diod, a multi-threaded, user space file server \
that speaks 9P2000.L protocol."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.24+53.g0d87511"

RPM_NAME = "diod-1.0.24+53.g0d87511-4.2.aarch64.rpm"
RPM_HASH = "0d4f404ae6c03c6925134c532ab5789919e3ab1fcfded70158ab141fd99b728e77abf4bb5540d051473f8080290007016d2c1c73d22d6782c717acacdc703491"

RPROVIDES:${PN} += "config(diod) \
diod \
diod(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblua5.1.so.5()(64bit) \
libmunge.so.2()(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libwrap.so.0()(64bit)"

inherit rpm
