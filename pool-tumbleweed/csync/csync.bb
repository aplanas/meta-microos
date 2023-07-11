SUMMARY = "A user level bidirectional client only file synchronizer"
DESCRIPTION = "csync is an implementation of a file synchronizer which provides the \
feature of roaming home directories for Linux clients. csync makes use \
of libsmbclient in Samba/Windows environments."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.0"

RPM_NAME = "csync-0.50.0-11.10.aarch64.rpm"
RPM_HASH = "ee1728007f93c8a90ae6f425fed9c056b62a5e6e61ed8a72f0198dc01674fac4a154a7993cb0e9cf4514a9dfafdf01a79b5c856bf9901a00bf0ece11ceff182e"

RPROVIDES:${PN} += "csync"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcsync.so.0"

inherit rpm
