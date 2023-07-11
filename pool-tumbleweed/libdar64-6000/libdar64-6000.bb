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

PV = "2.7.9"

RPM_NAME = "libdar64-6000-2.7.9-1.1.aarch64.rpm"
RPM_HASH = "21f91d2c141fe32ee58536e0cb967692bd21d9adac331ba92c20c7c4e74188279cdf5325f27e527d8553aa019a19aa76d2ceb947ae06c1d2c22162360351da3a"

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
