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

RPM_NAME = "pgn-extract-22.11-1.4.aarch64.rpm"
RPM_HASH = "e1bfe5499ce946b64a76e8891dd7a20ddb21c8710796f319b0d8c4f6da4ea55280c6619937b22ad880fef6e03e02397ddb5c60cf93895de85eda31720e288cdc"

RPROVIDES:${PN} += "pgn-extract"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
