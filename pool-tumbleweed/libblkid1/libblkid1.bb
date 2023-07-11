SUMMARY = "Filesystem detection library"
DESCRIPTION = "Library for filesystem detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libblkid1-2.39-1.1.aarch64.rpm"
RPM_HASH = "8396cfe32606dde8ab0a345c2760eb31ecc5e984f8087beffcae1faa7f100c344ef1b570c5905d15e150ce57891e6ae4b79922626d630539a053751929d514be"

RPROVIDES:${PN} += "libblkid.so.1 \
libblkid1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
