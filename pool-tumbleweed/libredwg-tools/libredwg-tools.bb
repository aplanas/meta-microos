SUMMARY = "Command line utilities for handling DWG file"
DESCRIPTION = "GNU LibreDWG is a C library to handle DWG files. It can replace the \
OpenDWG libraries. DWG is the native file format of AutoCAD. \
 \
This package contains some command line utilities using this library."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.5"

RPM_NAME = "libredwg-tools-0.12.5-3.4.aarch64.rpm"
RPM_HASH = "787ba1a12db7d6a6b1f77caf593065119ba567c34462358ac3910f0beeb17d20552c12eeaaa928cbf953ef965dcc96702946cff2d594252e5a1afafb6564fcb3"

RPROVIDES:${PN} += "libredwg-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libredwg.so.0"

inherit rpm
