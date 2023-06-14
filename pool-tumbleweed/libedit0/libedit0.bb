SUMMARY = "Command Line Editing and History Library"
DESCRIPTION = "libedit is a command line editing and history library. It is designed \
to be used by interactive programs that allow the user to type commands \
at a terminal prompt."
LICENSE = "BSD-3-Clause"

PV = "20210910.3.1"

RPM_NAME = "libedit0-20210910.3.1-2.1.aarch64.rpm"
RPM_HASH = "4b4ddb57bcf152ef43ef93c5a463e94bef33f525fb37054d37e9ebcec5f3cd8dc41b44902971a6ade22954dbc3af05105bffbef91e39410aae5e898b638f0340"

RPROVIDES:${PN} += "libedit \
libedit.so.0 \
libedit0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
