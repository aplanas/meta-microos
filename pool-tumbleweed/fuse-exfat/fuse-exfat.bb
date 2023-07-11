SUMMARY = "exFAT file system implementation"
DESCRIPTION = "This driver is an exFAT file system implementation with write \
support. exFAT is a simple file system created by Microsoft. It is \
intended to replace FAT32, removing some of its limitations. exFAT is \
a standard FS for SDXC memory cards."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "fuse-exfat-1.4.0-1.3.aarch64.rpm"
RPM_HASH = "701511dff3c36931d200e8187b4701507c68e71faa7c91590867d63ca76f966d8013a8697373a1df3c366dd596d9d5b2d962a03d93238fc1472fca12990116f3"

RPROVIDES:${PN} += "fuse-exfat"

RDEPENDS:${PN} += "/usr/bin/sh \
fuse \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2"

inherit rpm
