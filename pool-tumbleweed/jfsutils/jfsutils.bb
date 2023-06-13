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

RPM_NAME = "jfsutils-1.1.15-20.5.aarch64.rpm"
RPM_HASH = "0302c51635e622650c046740c09e1d80c47b8ac15a75bb526120e7e49eba5c26d328f58f2d7d373770cbb459da76fdb2b6db72b6d7b4df27f9bc6629fb1ed29c"

RPROVIDES:${PN} += "jfsprogs \
jfsutils \
jfsutils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libuuid.so.1()(64bit)"

inherit rpm
