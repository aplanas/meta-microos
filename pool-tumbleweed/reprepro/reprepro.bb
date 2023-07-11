SUMMARY = "Debian repository metadata generator"
DESCRIPTION = "reprepro is a tool to manage a repository of Debian packages (.deb).  It \
stores files either being injected manually or downloaded from some other \
repository (partially) mirrored into one pool/ hierarchy.  Managed packages \
and files are stored in a Berkeley DB, so no database server is needed. \
Checking signatures of mirrored repositories and creating signatures of the \
generated Package indexes is supported."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & MIT"

PV = "5.4.1"

RPM_NAME = "reprepro-5.4.1-1.4.aarch64.rpm"
RPM_HASH = "381878efce2c3242ef140f5969c2c02cd313005c52cd9e155f7fa533a259cb6dc107d56bc6972a667c47a08a83f848e5f5538d6bb9a0ddf0853fcc5ac08da739"

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
