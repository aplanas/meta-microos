SUMMARY = "Osmocom VTY interface library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
The libosmovty library implements the interactive command-line on the \
VTY (Virtual TTY), as well as configuration file parsing."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmovty9-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "7f9692c7053851f466e4350fc55ecd01dcace4c09000172851f6efc8ca08c16a51cc8d5ef6d7c649b3fe7fb259a981df354a656adbd2839ec0ce7d5343d5f24c"

RPROVIDES:${PN} += "libosmovty.so.9 \
libosmovty9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.20 \
libtalloc.so.2"

inherit rpm
