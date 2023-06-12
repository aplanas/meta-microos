SUMMARY = "Text-based Organizer"
DESCRIPTION = "Calcurse is a text-based personal organizer which helps keep track of events \
and everyday tasks. It has a calendar and a 'todo' list, and puts your \
appointments in order. The user interface is configurable, and you can choose \
between different color schemes and layouts. All of the commands are \
documented within an online help system."
LICENSE = "BSD-2-Clause"

PV = "4.8.0"

RPM_NAME = "calcurse-4.8.0-1.4.aarch64.rpm"
RPM_HASH = "488646baa1bd17429ba27672a30054b1a5d7c9088610121d57dd808c17c44d1887ae7d2233a2064ef4ee64ca73d9ef9260a52721caa28b021b1b1a9565666d72"

RPROVIDES:${PN} += "application() \
application(calcurse.desktop) \
calcurse \
calcurse(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
