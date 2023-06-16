SUMMARY = "A Backup and Archiving Utility"
DESCRIPTION = "GNU cpio is a program to manage archives of files. Cpio copies files \
into or out of a cpio or tar archive. An archive is a file that contains \
other files plus information about them, such as their pathname, owner, \
time stamps, and access permissions. The archive can be another file on \
the disk, a magnetic tape, or a pipe."
LICENSE = "GPL-3.0-only"

PV = "2.13"

RPM_NAME = "cpio-2.13-5.3.aarch64.rpm"
RPM_HASH = "b53ae5473921a4fd0c07fbe3409640fce180ccd8bc969ca386b230f837fbbc79afaae1685a77eac2c0232444c30dd1af332ec36a066ae2f82adb2da94c1bd5de"

RPROVIDES:${PN} += "cpio"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
