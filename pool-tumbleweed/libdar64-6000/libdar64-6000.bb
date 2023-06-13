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

PV = "2.7.8"

RPM_NAME = "libdar64-6000-2.7.8-1.4.aarch64.rpm"
RPM_HASH = "62d8057a54cab35d5368d5aca6836adeaec189a8fe057ae477a467ae4a36c5f9775b1585d7d24a6c6429224b3bb11ab5a5a095e7a3b951b319257b2782ab5b47"

RPROVIDES:${PN} += "config(libdar64-6000) \
libdar \
libdar64-6000 \
libdar64-6000(aarch-64) \
libdar64.so.6000()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcrypt.so.20()(64bit) \
liblzma.so.5()(64bit) \
liblzo2.so.2()(64bit) \
librsync.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
