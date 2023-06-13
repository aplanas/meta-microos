SUMMARY = "Lynx-style Info Browser"
DESCRIPTION = "Pinfo is a curses based, Lynx-style info browser."
LICENSE = "GPL-2.0-only"

PV = "0.6.13"

RPM_NAME = "pinfo-0.6.13-2.7.aarch64.rpm"
RPM_HASH = "a1481bc29037b0d71c061944a1c9dd8b4469be67df702d623dd3678399bfaf83d911e0aefa4c66e88c3fa3e61a50f54ab7ff80a163d29845be2d594894e9f5e2"

RPROVIDES:${PN} += "config(pinfo) \
pinfo \
pinfo(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
