SUMMARY = "Library for Colour ASCII Art, text mode graphics"
DESCRIPTION = "libcaca is the Colour AsCii Art library. It provides high level \
functions for colour text drawing, simple primitives for line, polygon \
and ellipse drawing, as well as powerful image to text conversion \
routines."
LICENSE = "WTFPL"

PV = "0.99.beta20"

RPM_NAME = "libcaca0-0.99.beta20-1.4.aarch64.rpm"
RPM_HASH = "abbbb86ebe6aabaceeafc526818903244fdd16b2093059c4534e6082eb5dc0e7d15d09f226293c141a33d5325bd52083d8cf0faf6756311a87154ea3c8cd58cf"

RPROVIDES:${PN} += "libcaca \
libcaca++.so.0()(64bit) \
libcaca.so.0()(64bit) \
libcaca0 \
libcaca0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libslang.so.2()(64bit) \
libslang.so.2(SLANG2)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libz.so.1()(64bit)"

inherit rpm
