SUMMARY = "A Backup and Archiving Utility"
DESCRIPTION = "GNU cpio is a program to manage archives of files. Cpio copies files \
into or out of a cpio or tar archive. An archive is a file that contains \
other files plus information about them, such as their pathname, owner, \
time stamps, and access permissions. The archive can be another file on \
the disk, a magnetic tape, or a pipe."
LICENSE = "GPL-3.0-only"

PV = "2.13"

RPM_NAME = "cpio-2.13-5.5.aarch64.rpm"
RPM_HASH = "6ee3970609e3ea70336f6610d797c96f57137107cbb76eb41b37bd9a1241dc5f0fbbe1e4adc101fe11ec5cf358d28c96f26453aa097b3e6f8a9641f642e51959"

RPROVIDES:${PN} += "cpio"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
