SUMMARY = "Versatile tool for fast incremental file transfer"
DESCRIPTION = "Rsync is a fast and extraordinarily versatile file  copying  tool. It can copy \
locally, to/from another host over any remote shell, or to/from a remote rsync \
daemon. It offers a large number of options that control every aspect of its \
behavior and permit very flexible specification of the set of files to be \
copied. It is famous for its delta-transfer algorithm, which reduces the amount \
of data sent over the network by sending only the differences between the \
source files and the existing files in the destination. Rsync is widely used \
for backups and mirroring and as an improved copy command for everyday use."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.7"

RPM_NAME = "rsync-3.2.7-3.1.aarch64.rpm"
RPM_HASH = "77bf49e4478282f8341851c4f520e80d393af0163aa89c7987a0c197d9020ae7492c689b41e919f9dde4b08449d9662be27bafb527b7a7ecdcc09f3d607e4491"

RPROVIDES:${PN} += "config-rsync \
rsync"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
grep \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblz4.so.1 \
libpopt.so.0 \
libslp.so.1 \
libxxhash.so.0 \
libz.so.1 \
libzstd.so.1 \
sed"

inherit rpm
