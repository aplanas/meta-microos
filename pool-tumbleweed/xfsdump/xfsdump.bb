SUMMARY = "Administrative Utilities for the XFS File System"
DESCRIPTION = "The xfsdump package contains xfsdump, xfsrestore, and a number of other \
utilities for administering XFS file systems. \
 \
xfsdump examines files in a file system, determines which files need to \
be backed up, and copies those files to a specified disk, tape, or \
other storage medium.  It uses XFS-specific directives for optimizing \
the dump of an XFS file system and also knows how to backup XFS \
extended attributes.  Backups created with xfsdump are 'endian safe' \
and can thus be transferred between Linux machines of different \
architectures and also between IRIX machines. \
 \
xfsrestore performs the inverse function of xfsdump.  It can restore a \
full backup of a file system.  Subsequent incremental backups can then \
be layered on top of the full backup.  Single files and directory \
subtrees may be restored from full or partial backups."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.12"

RPM_NAME = "xfsdump-3.1.12-2.3.aarch64.rpm"
RPM_HASH = "d27c8c84fba6818a4def56711a3a052f7626ea42106225801e05e46abdc8ea4a6488ecf069683a3c378c063c0e47df540959b1484a6e811e0ce526d106fb43f0"

RPROVIDES:${PN} += "xfsdump"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libattr.so.1 \
libc.so.6 \
libhandle.so.1 \
libncurses.so.6 \
libtinfo.so.6 \
libuuid.so.1"

inherit rpm
