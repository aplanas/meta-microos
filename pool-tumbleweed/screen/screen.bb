SUMMARY = "A program to allow multiple screens on a VT100/ANSI Terminal"
DESCRIPTION = "With this program you can take advantage of the multitasking abilities \
of your Linux system by opening several sessions over one terminal. The \
sessions can also be detached and resumed from another login terminal. \
 \
Documentation: man page"
LICENSE = "GPL-3.0-or-later"

PV = "4.9.0"

RPM_NAME = "screen-4.9.0-2.4.aarch64.rpm"
RPM_HASH = "236abc29193684c31bf6513b71ecef91c99675445da6e6328a5a5adac160f3b1b78f6a27a221a44ec4b65fd68fff7c9f3789736538be19430e65e843da816de0"

RPROVIDES:${PN} += "config-screen \
screen"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libpam.so.0 \
libtinfo.so.6 \
libutempter.so.0 \
permissions \
terminfo-base"

inherit rpm
