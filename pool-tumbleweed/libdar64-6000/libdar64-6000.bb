SUMMARY = "Backup and Restore Application"
DESCRIPTION = "Dar stands for Disk ARchive and is a hardware independent backup \
solution. Dar uses catalogs (unlike tar), so it is possible to extract \
a single file without having to read the whole archive, and it is also \
possible to create incremental backups. \
 \
Dar archives can also be created, or used, via the libdar library (for \
example with KDar, a KDE application). \
 \
This package contains the library used by Dar and KDar."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.7.10"

RPM_NAME = "libdar64-6000-2.7.10-1.1.aarch64.rpm"
RPM_HASH = "dfcef702a252361043fd1cc26ba0b669ad7defa6a4b78412f53814f016ce200f53a42767a7bfc5ec78283f3c77c991089de697fcb22fbae39d745711b6450d36"

RPROVIDES:${PN} += "config-libdar64-6000 \
libdar \
libdar64-6000 \
libdar64.so.6000"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libargon2.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt.so.20 \
liblzma.so.5 \
liblzo2.so.2 \
librsync.so.2 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
