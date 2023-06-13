SUMMARY = "GnuCOBOL shared library"
DESCRIPTION = "GnuCOBOL (formerly OpenCOBOL) is a COBOL compiler. \
cobc translates COBOL to executable using intermediate C sources, \
providing full access to nearly all C libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "3.1.2"

RPM_NAME = "libcob4-3.1.2-1.13.aarch64.rpm"
RPM_HASH = "49020a579073fd88354d167c60cc7ab02fea15c46af5042facb93fef2559e5e7e9af8dc819022c3ad845b6eb5ac4f19b2895d93467ee9ef31bbc64f9efb0b81c"

RPROVIDES:${PN} += "libcob.so.4()(64bit) \
libcob4 \
libcob4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdb-4.8.so()(64bit) \
libgmp.so.10()(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_0.14)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libncursesw.so.6(NCURSESTW6_5.8.20110226)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
