SUMMARY = "A user level bidirectional client only file synchronizer"
DESCRIPTION = "csync is an implementation of a file synchronizer which provides the \
feature of roaming home directories for Linux clients. csync makes use \
of libsmbclient in Samba/Windows environments."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.0"

RPM_NAME = "csync-0.50.0-11.9.aarch64.rpm"
RPM_HASH = "6ce793d07fa5357aae1a4459aae7659331387438fdce35aaafefada2253391652c2a2ea8cba1612e3f8ebaacf549d30056c4e979053f81cbb2336d138eace8f6"

RPROVIDES:${PN} += "csync"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcsync.so.0"

inherit rpm
