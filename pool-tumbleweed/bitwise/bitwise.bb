SUMMARY = "Interactive bit-wise operation in ncurses"
DESCRIPTION = "Bitwise is a multi base interactive calculator supporting dynamic base \
conversion and bit manipulation. It's a handy tool for low level \
hackers, kernel developers and device drivers developers. \
 \
Some of the features include: \
 * Interactive ncurses interface command line calculator. \
 * Individual bit manipulator. \
 * Bitwise operations such as NOT, OR, AND, XOR, and shifts."
LICENSE = "GPL-3.0-or-later"

PV = "0.50"

RPM_NAME = "bitwise-0.50-1.1.aarch64.rpm"
RPM_HASH = "a77163f8be1fe0ec120dadb4d73aa3b3d2fe3cef91fbfb4586173eb7f34ccb2404d0cebe2555b85f332698f3ddca558faaa22ea63147eb74451262d808834a02"

RPROVIDES:${PN} += "bitwise"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libform.so.6 \
libncurses.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
