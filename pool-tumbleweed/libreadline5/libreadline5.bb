SUMMARY = "The Readline Library"
DESCRIPTION = "The readline library is used by the Bourne Again Shell (bash, the \
standard command interpreter) for easy editing of command lines.  This \
includes history and search functionality."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "libreadline5-5.2-140.3.aarch64.rpm"
RPM_HASH = "4be1727c897947b63a4dbabce55f6975cf9244fd9bb201aa6122833dc5082b19e04b3403709d01d8270fe24d0c6bd562009b852fe34abb433532c6c6bfa7f488"

RPROVIDES:${PN} += "bash:/lib64/libreadline.so.5 \
libhistory.so.5()(64bit) \
libreadline.so.5()(64bit) \
libreadline5 \
libreadline5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
