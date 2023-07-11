SUMMARY = "A Clone of the Original Tetris Game"
DESCRIPTION = "TINT is a clone of the original tetris game written by Alexey Pajitnov, Dmitry \
Pavlovsky, and Vadim Gerasimov. The game is close to the original, but \
there are a few differences."
LICENSE = "BSD-3-Clause"

PV = "0.07"

RPM_NAME = "tint-0.07-1.6.aarch64.rpm"
RPM_HASH = "bb36d98a37d9ce3ef64435373c5ca5bbf0518ee7d439c0432adb6753f765c3a9db6600efbcd98144a2f22ca8cc95ddc95b26f09881cad9bf0dc15516b59dc676"

RPROVIDES:${PN} += "tint"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
