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

PV = "2.7.10"

RPM_NAME = "libdar-devel-2.7.10-1.1.aarch64.rpm"
RPM_HASH = "c3dccda885be33d684c8a716adeb951cd6415f07e5d07a916739333e5e19f265c082685a711ae69a8ad989e286ddb960989d2a872e90e9361ef41e40c93b6c8e"

RPROVIDES:${PN} += "libdar-devel \
pkgconfig-libdar64"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libdar64-6000 \
openssl-devel \
pkgconfig-bzip2 \
pkgconfig-zlib"

inherit rpm
