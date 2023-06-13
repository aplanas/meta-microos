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

RPM_NAME = "bitwise-0.43-1.7.aarch64.rpm"
RPM_HASH = "91ac00915302c8c9386494ae68c82f7a974787aa60062e8ece7357b3352244aadd045dd4b92cbc75f2e2b8809febd72001518e32a758117cd8f040528a66da93"

RPROVIDES:${PN} += "bitwise \
bitwise(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libform.so.6()(64bit) \
libncurses.so.6()(64bit) \
libreadline.so.8()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
