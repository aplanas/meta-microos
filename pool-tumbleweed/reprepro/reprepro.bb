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

RPROVIDES:${PN} += "reprepro"

RDEPENDS:${PN} += "bzip2 \
gpg2 \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libbz2.so.1 \
libc.so.6 \
libdb-4.8.so \
libgpg-error.so.0 \
libgpgme.so.11 \
liblzma.so.5 \
libz.so.1 \
tar \
zstd"

inherit rpm
