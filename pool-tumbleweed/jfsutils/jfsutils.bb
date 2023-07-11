SUMMARY = "IBM JFS Utility Programs"
DESCRIPTION = "This package contains utilities for managing IBM's Journaled File \
System (JFS) under Linux.  The following utilities are available: \
 \
o fsck.jfs--initiate replay of the JFS transaction log and check and \
repair a JFS formatted device o logdump--dump a JFS formatted device's \
journal log o logredo--replay a JFS formatted device's journal log o \
mkfs.jfs--create a JFS formatted partition o xchkdmp--dump the contents \
of a JFS fsck log file created with xchklog o xchklog--extract a log \
from the JFS fsck workspace into a file o xpeek--shell-type JFS file \
system editor"
LICENSE = "GPL-2.0-or-later"

PV = "1.1.15"

RPM_NAME = "jfsutils-1.1.15-20.6.aarch64.rpm"
RPM_HASH = "4e392d298108d0f9fed5eaeebb70e3e8cc6e4a692d098b190dd750ecccb9736cfcfff6c4f1be9c89d97f11213cf1204f4cc37f0f6db463232d215bf1627423b4"

RPROVIDES:${PN} += "jfsprogs \
jfsutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm
