SUMMARY = "Shared Libraries for coin-or-Cbc"
DESCRIPTION = "Cbc (Coin-or branch and cut) is an open-source mixed integer linear \
programming solver written in C++. It can be used as a callable \
library or using a stand-alone executable. It can be used in a wide \
variety of ways through various modeling systems, packages, etc."
LICENSE = "EPL-2.0"

PV = "2.10.8"

RPM_NAME = "libCbc3-2.10.8-1.3.aarch64.rpm"
RPM_HASH = "0981f8a7bacaee9528b9abd339b4ca9f26bfe23b215ca865afecf52332a40f910fd901ec8f778b7428ed9ca42706e3cf9762891f7f8bef3dbf40c857d899e6dc"

RPROVIDES:${PN} += "libCbc.so.3 \
libCbc3 \
libCbcSolver.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libCgl.so.1 \
libClp.so.1 \
libCoinUtils.so.3 \
libOsi.so.1 \
libOsiClp.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
