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

RPM_NAME = "xfsdump-3.1.12-2.4.aarch64.rpm"
RPM_HASH = "46f10bec13f7218fdcc2b1257f9ae572c53fb270a3814a6b29b665824cc8d32592bbfe1e8c61753d0b828a3117c1ed6203d8c287627f4af0512ab866f4a89004"

RPROVIDES:${PN} += "xfsdump"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libattr.so.1 \
libc.so.6 \
libhandle.so.1 \
libncurses.so.6 \
libtinfo.so.6 \
libuuid.so.1"

inherit rpm
