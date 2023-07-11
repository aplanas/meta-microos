SUMMARY = "Backup and Restore Application"
DESCRIPTION = "Dar stands for Disk ARchive and is a hardware independent backup \
solution. Dar uses catalogs (unlike tar), so it is possible to extract \
a single file without having to read the whole archive, and it is also \
possible to create incremental backups. \
 \
Dar archives can also be created, or used, via the libdar library (with \
KDar, a KDE application, for example). \
 \
This package contains the library used by Dar and KDar."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.7.9"

RPM_NAME = "libdar-devel-2.7.9-1.1.aarch64.rpm"
RPM_HASH = "bf1fe48bab6e1c88555b751421548c9589df2c694aa1e5c7de854e2cfd8be7e8fd2f2be27a906ffbc984c2e1221bff50bde3e4317f45e819b5fd5de06126dfe0"

RPROVIDES:${PN} += "libdar-devel \
pkgconfig-libdar64"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libdar64-6000 \
openssl-devel \
pkgconfig-bzip2 \
pkgconfig-zlib"

inherit rpm
