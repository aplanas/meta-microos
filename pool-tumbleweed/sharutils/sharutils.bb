SUMMARY = "GNU shar utilities"
DESCRIPTION = "This is the set of GNU shar utilities. \
 \
shar makes shell archives out of many files, preparing them for \
transmission by electronic mail services.  Use unshar to unpack shell \
archives after reception. \
 \
uuencode prepares a file for transmission over an electronic channel \
which ignores or otherwise mangles the eight bit (high order bit) of \
bytes.	uudecode does the converse transformation."
LICENSE = "GPL-3.0-or-later"

PV = "4.15.2"

RPM_NAME = "sharutils-4.15.2-7.7.aarch64.rpm"
RPM_HASH = "dc6e8c84ed9474273789afca7c9162732354951b3c1ba69492fd81941073d5d730ba6af7fd8247603c8096978e181aa337916166a0878d787fce2fcb992b9d3c"

RPROVIDES:${PN} += "sharutil \
sharutils"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
