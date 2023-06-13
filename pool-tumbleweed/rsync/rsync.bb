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

RPM_NAME = "rsync-3.2.7-2.1.aarch64.rpm"
RPM_HASH = "8aabf4b786b11026f51b533773500e10c1128819a9ed4a7465946977347c5605cb9b94fe2fb225624f0bfc82003044718614b0a4eefc9d8dca6e121349516369"

RPROVIDES:${PN} += "config(rsync) \
rsync \
rsync(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
grep \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libacl.so.1()(64bit) \
libacl.so.1(ACL_1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
liblz4.so.1()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libslp.so.1()(64bit) \
libxxhash.so.0()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit) \
sed"

inherit rpm
