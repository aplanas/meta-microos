SUMMARY = "Featureful tar-Compatible Archiver and Compressor"
DESCRIPTION = "btar is a tar-compatible archiver which allows arbitrary compression and \
ciphering, redundancy, differential backup, indexed extraction, multicore \
compression, input and output serialisation, and tolerance to partial \
archive errors."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.1"

RPM_NAME = "btar-1.1.1-2.11.aarch64.rpm"
RPM_HASH = "ae4a324ad9a8d03274d6c25d4a4bfbe3a603c90b71114cf5cbc83a46fda7e1974ac4a404ee5148feda86e5839541dfecc2ae62260f590e62c610f078062b768e"

RPROVIDES:${PN} += "btar btar(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) librsync.so.2()(64bit)"

inherit rpm
