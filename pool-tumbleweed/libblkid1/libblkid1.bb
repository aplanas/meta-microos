SUMMARY = "Filesystem detection library"
DESCRIPTION = "Library for filesystem detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libblkid1-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "d4adf85a8a4811ddec4d7b803bbc5fa0a5e1808b05869818156b51405ce89463cb98e9e89cfe75f9d93924eae28b6d8e27596d9bc44c54b0239dbab92af86900"

RPROVIDES:${PN} += "libblkid.so.1 \
libblkid1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
