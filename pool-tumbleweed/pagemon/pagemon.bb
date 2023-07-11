SUMMARY = "Interactive memory/page monitoring tool"
DESCRIPTION = "pagemon is a ncurses based interactive memory/page monitoring tool \
allowing one to browse the memory map of an active running process \
on Linux."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.01"

RPM_NAME = "pagemon-0.02.01-1.3.aarch64.rpm"
RPM_HASH = "de69fb5cbebf3a0d413d094188993880bb5c59809e4275d899405d7c6ada1be05d5c6c58e12d077f1b2271e8729d9b889cf17c7c5e7ec4ca3f83d82d07bef3d2"

RPROVIDES:${PN} += "pagemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
