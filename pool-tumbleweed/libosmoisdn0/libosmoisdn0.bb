SUMMARY = "Osmo ISDN utility library"
DESCRIPTION = "The libosmocore library contains various utility functions, a \
collection of common code used in various ISDN related sub-projects \
inside the Osmocom family of projects. It includes an I.460 \
sub-channel multiplex and a generic LAPD core."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmoisdn0-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "1c8b8ffe3d7225cfd7f2ac065fde7f592b54a207382b26ef818eb304b9461638ff38138f1993075f80301a0e541fc4b9812ac8b5cb076ea77cb4586b228fd51a"

RPROVIDES:${PN} += "libosmoisdn.so.0 \
libosmoisdn0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.20 \
libtalloc.so.2"

inherit rpm
