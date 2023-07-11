SUMMARY = "Library to crack passwords using dictionaries"
DESCRIPTION = "CrackLib tests passwords to determine whether they match \
certain security-oriented characteristics. You can use CrackLib to \
stopusers from choosing passwords that are too simple.This package \
contains a full dictionary file used by cracklib."
LICENSE = "LGPL-2.1-only"

PV = "2.9.11"

RPM_NAME = "libcrack2-2.9.11-1.1.aarch64.rpm"
RPM_HASH = "6ed2c5c16ac8de218df721a62b9566f343e8ceaf103911210a8ca9bdd9365fe7229eb7fe43c7168e5ba1c6d29faf7a16cf6ea874538bcfbef1b43457bd35a926"

RPROVIDES:${PN} += "libcrack.so.2 \
libcrack2"

RDEPENDS:${PN} += "/sbin/ldconfig \
cracklib \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
