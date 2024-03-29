SUMMARY = "Ncurses-based CD-DA player"
DESCRIPTION = "tcd is a tiny cd player for a text terminal. It uses ncurses for \
drawing and SDL for playing audio CDs."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0"

RPM_NAME = "tcd-2.2.0-7.4.aarch64.rpm"
RPM_HASH = "64760dec0e75223577ccc8ae3ce9b1d25ed2c7a76e5f30a0e779db26d34c146fcdf8d6b48d6c00c7589683da5be3fd34d52c32946f253dc3f0aa87760cb02aa2"

RPROVIDES:${PN} += "tcd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
