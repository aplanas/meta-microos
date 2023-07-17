SUMMARY = "A Backup and Archiving Utility"
DESCRIPTION = "GNU cpio is a program to manage archives of files. Cpio copies files \
into or out of a cpio or tar archive. An archive is a file that contains \
other files plus information about them, such as their pathname, owner, \
time stamps, and access permissions. The archive can be another file on \
the disk, a magnetic tape, or a pipe."
LICENSE = "GPL-3.0-only"

PV = "2.14"

RPM_NAME = "cpio-2.14-1.1.aarch64.rpm"
RPM_HASH = "c5612d3681e0d8759aa831681b121659343e2dc54690900b5fcb55358b49a2685d2699d923ca17d014f10d3c8c85925def57cd9d93f29126931d6c4ab3293955"

RPROVIDES:${PN} += "cpio"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
