SUMMARY = "Osmocom SIM card related utility library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
The libosmosim library in particular contains routines for SIM card \
access."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmosim2-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "0ea455d646b0d8990bf9226509283f5f64f7ac44866e1b642e779cd349c5dbdc0b2e62dbc31f96098ac3fb41288d89522d3a85fd1e8ede000f0c212ce70db226"

RPROVIDES:${PN} += "libosmosim.so.2 \
libosmosim2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.20 \
libosmogsm.so.18 \
libpcsclite.so.1 \
libtalloc.so.2"

inherit rpm
