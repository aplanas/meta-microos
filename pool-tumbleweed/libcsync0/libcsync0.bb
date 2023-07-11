SUMMARY = "A user level bidirectional client only file synchronizer"
DESCRIPTION = "csync is an implementation of a file synchronizer which provides the \
feature of roaming home directories for Linux clients. csync makes use \
of libsmbclient in Samba/Windows environments."
LICENSE = "LGPL-2.1-or-later"

PV = "0.50.0"

RPM_NAME = "libcsync0-0.50.0-11.10.aarch64.rpm"
RPM_HASH = "92067555044f8855996315837aaba83fd0f440ab3fa7ebab158f4aca71782915fc68bc62c1258532b401638df59337107c381e7e6b58218e7b61f94d6dfaaa1a"

RPROVIDES:${PN} += "config-libcsync0 \
libcsync.so.0 \
libcsync0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
