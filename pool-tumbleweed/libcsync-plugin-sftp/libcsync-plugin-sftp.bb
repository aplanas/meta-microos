SUMMARY = "A user level bidirectional client only file synchronizer"
DESCRIPTION = "csync is an implementation of a file synchronizer which provides the \
feature of roaming home directories for Linux clients. csync makes use \
of libsmbclient in Samba/Windows environments."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.0"

RPM_NAME = "libcsync-plugin-sftp-0.50.0-11.10.aarch64.rpm"
RPM_HASH = "ffc8c38a004298327e04b6074b689374be99a09f8564484c6280074ab55c14a14c06473714bdfccd5609df104044196239bf8ec52e4a4ff1b9729a0c18f2bc32"

RPROVIDES:${PN} += "libcsync-plugin-sftp"

RDEPENDS:${PN} += "libc.so.6 \
libcsync.so.0 \
libcsync0 \
libssh.so.4"

inherit rpm
