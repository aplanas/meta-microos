SUMMARY = "A Clone of the Original Tetris Game"
DESCRIPTION = "TINT is a clone of the original tetris game written by Alexey Pajitnov, Dmitry \
Pavlovsky, and Vadim Gerasimov. The game is close to the original, but \
there are a few differences."
LICENSE = "BSD-3-Clause"

PV = "0.07"

RPM_NAME = "tint-0.07-1.5.aarch64.rpm"
RPM_HASH = "02b6cd346c11a0446d1b5de12f703a65a48024b7e9b6220eeca6b48fb46843986624c8269afb2ca3294684ef9e4b7b917a3838be4bf25e03bc437cb3da834aa9"

RPROVIDES:${PN} += "application() \
application(tint.desktop) \
tint \
tint(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libncurses.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
