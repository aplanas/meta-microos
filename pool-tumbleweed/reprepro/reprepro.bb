SUMMARY = "Debian repository metadata generator"
DESCRIPTION = "reprepro is a tool to manage a repository of Debian packages (.deb).  It \
stores files either being injected manually or downloaded from some other \
repository (partially) mirrored into one pool/ hierarchy.  Managed packages \
and files are stored in a Berkeley DB, so no database server is needed. \
Checking signatures of mirrored repositories and creating signatures of the \
generated Package indexes is supported."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & MIT"

PV = "5.4.1"

RPM_NAME = "reprepro-5.4.1-1.3.aarch64.rpm"
RPM_HASH = "b1d3737a7bff17d3732584db3687de9c801912836e5607d8dacf0666820001c519af218a6b6bbe29518a89f00e69da2973b1a42c28d0f7d6e11e65030dc5168d"

RPROVIDES:${PN} += "reprepro \
reprepro(aarch-64)"
RDEPENDS:${PN} += "bzip2 \
gpg2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libarchive.so.13()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdb-4.8.so()(64bit) \
libgpg-error.so.0()(64bit) \
libgpg-error.so.0(GPG_ERROR_1.0)(64bit) \
libgpgme.so.11()(64bit) \
libgpgme.so.11(GPGME_1.0)(64bit) \
libgpgme.so.11(GPGME_1.1)(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0.2)(64bit) \
tar \
zstd"

inherit rpm
