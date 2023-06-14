SUMMARY = "Utility for Creating romfs File Systems"
DESCRIPTION = "Genromfs is a tool for creating romfs file systems, which are \
lightweight, read-only file systems supported by the Linux kernel. \
Romfs file systems were traditionally used for the initial RAM disks \
used during installation."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.7"

RPM_NAME = "genromfs-0.5.7-1.2.aarch64.rpm"
RPM_HASH = "44916fd6405f7e8360d91b60e4cc160e9a14d7606c604ff4bbe7a3ae7bee3e20cadeae5620f8b5f568d5343f7bc3f836f2f3112767b38dddf8e711d398831ac8"

RPROVIDES:${PN} += "genromfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
