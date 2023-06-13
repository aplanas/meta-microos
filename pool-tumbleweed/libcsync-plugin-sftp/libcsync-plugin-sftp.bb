SUMMARY = "A user level bidirectional client only file synchronizer"
DESCRIPTION = "csync is an implementation of a file synchronizer which provides the \
feature of roaming home directories for Linux clients. csync makes use \
of libsmbclient in Samba/Windows environments."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.0"

RPM_NAME = "libcsync-plugin-sftp-0.50.0-11.9.aarch64.rpm"
RPM_HASH = "0bc6d17f3b2521ac9b90ca9b67b52904a40b427e6d08f749ee39c70420cb929c5c17c1e2c82da51473ac8e5dce86c28b985108ffee2a54c5f194ec17c7918787"

RPROVIDES:${PN} += "libcsync-plugin-sftp \
libcsync-plugin-sftp(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libcsync.so.0()(64bit) \
libcsync0 \
libssh.so.4()(64bit) \
libssh.so.4(LIBSSH_4_5_0)(64bit)"

inherit rpm
