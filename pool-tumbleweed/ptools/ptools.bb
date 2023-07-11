SUMMARY = "The process tools collection"
DESCRIPTION = "pbuildid dumps the build-ids of an executable, core file or a process, \
given the pid of that process. \
 \
 \
 \
Authors: \
-------- \
    Jan Blunck <jblunck@suse.de>"
LICENSE = "GPL-2.0+"

PV = "0.1"

RPM_NAME = "ptools-0.1-26.27.aarch64.rpm"
RPM_HASH = "7267c3f7511eecb2942546c42f0721d297371d7db087e22751354e57e74f0b0200725ff736850f665318518ac387702f7ec6056363468ec70aa00272c3a18360"

RPROVIDES:${PN} += "ptools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libelf.so.1 \
libpopt.so.0"

inherit rpm
