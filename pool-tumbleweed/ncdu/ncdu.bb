SUMMARY = "NCurses Disk Usage"
DESCRIPTION = "ncdu (NCurses Disk Usage) is a curses-based version of \
the well-known 'du', and provides a fast way to see what \
directories are using your disk space."
LICENSE = "MIT"

PV = "1.18.1"

RPM_NAME = "ncdu-1.18.1-1.1.aarch64.rpm"
RPM_HASH = "29dc0c77724cab56881e175ea706a41e49e69f706723b4ac650e0cbcdffa0ebb7be0b4c395a00cae678f2510d81c887b79c42522d273e12f1a5232000c4f27b7"

RPROVIDES:${PN} += "ncdu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
