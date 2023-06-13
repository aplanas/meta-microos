SUMMARY = "The Readline Library"
DESCRIPTION = "The readline library is used by the Bourne Again Shell (bash, the \
standard command interpreter) for easy editing of command lines.  This \
includes history and search functionality."
LICENSE = "GPL-3.0-or-later"

PV = "6.3"

RPM_NAME = "libreadline6-6.3-3.3.aarch64.rpm"
RPM_HASH = "6e2f011d1852bd1fc952e28b7dd44fa6a8a39d833be61cddd256f8c03fa367dd51777d58dc07ca026ca007175a41f2f68b433f47087b3b69be83d8cc186a071d"

RPROVIDES:${PN} += "bash:/lib64/libreadline.so.6 \
libhistory.so.6()(64bit) \
libreadline.so.6()(64bit) \
libreadline6 \
libreadline6(aarch-64) \
readline"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
