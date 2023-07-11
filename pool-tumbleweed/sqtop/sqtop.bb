SUMMARY = "'top' for Squid proxy process"
DESCRIPTION = "Console applicaton to display information about currently active client connections for a Squid proxy in a convenient way."
LICENSE = "GPL-2.0+"

PV = "2015.02.08"

RPM_NAME = "sqtop-2015.02.08-1.22.aarch64.rpm"
RPM_HASH = "59f223a3b886e6e0837c2549ac08bc269acd179ee627ee2b38944bde1933dc02052842a8e5434932600f3ca791299d5d896694363845d36ead2b217479287166"

RPROVIDES:${PN} += "sqtop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libncurses.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
