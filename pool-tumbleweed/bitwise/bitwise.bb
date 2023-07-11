SUMMARY = "Interactive bitwise operation in ncurses"
DESCRIPTION = "Bitwise is a multi base interactive calculator supporting dynamic base \
conversion and bit manipulation. It's a handy tool for low level \
hackers, kernel developers and device drivers developers. \
 \
Some of the features include: \
 * Interactive ncurses interface command line calculator. \
 * Individual bit manipulator. \
 * Bitwise operations such as NOT, OR, AND, XOR, and shifts."
LICENSE = "GPL-3.0-or-later"

PV = "0.43"

RPM_NAME = "bitwise-0.43-1.8.aarch64.rpm"
RPM_HASH = "29c01a7bdb51196a8f2454afbf84c6db7029988d0c6d32426663c315a0037b70045cfcdd77e1c0e467dae9ae4b957fda3acc9122d0df77410db58ad7932659d1"

RPROVIDES:${PN} += "bitwise"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libform.so.6 \
libncurses.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
