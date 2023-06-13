SUMMARY = "A CLI program for manipulating PGN files"
DESCRIPTION = "This is a command-line program for manipulating chess games recorded \
in the Portable Game Notation (PGN). \
Extracted games may be written out either including or excluding \
comments, NAGs, variations, move numbers, tags and/or results. \
Games may be given ECO classifications derived from the accompanying \
file /usr/share/pgn-extract/eco.pgn, or a customised version provided \
by the user. \
 \
For a full description of pgn-extract's functionality see \
/usr/share/doc/packages/pgn-extract/help.html."
LICENSE = "GPL-3.0-or-later"

PV = "22.11"

RPM_NAME = "pgn-extract-22.11-1.3.aarch64.rpm"
RPM_HASH = "02449a2559e475a17c1f2b1f854774152a61b0c2bdaa2fabab5c6afb591ad6ad75a0d2f14ed42484e8c86f39253bf307299d37cdf3af3d08a9038bf0fb89322f"

RPROVIDES:${PN} += "pgn-extract \
pgn-extract(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
