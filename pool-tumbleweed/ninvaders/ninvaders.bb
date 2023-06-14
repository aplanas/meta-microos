SUMMARY = "A space invaders-like game using ncurses"
DESCRIPTION = "A Space Invaders type game with text-only graphics."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1"

RPM_NAME = "ninvaders-0.1.1-2.11.aarch64.rpm"
RPM_HASH = "5645fd53aecf718fb69092d314f7e36754ba21786457c1050d76eefdf60d3cdfd5b09cffb3a13ba1c13df686437634c0adcacb3e2d86d59ab96680ec97d046e8"

RPROVIDES:${PN} += "ninvaders"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
