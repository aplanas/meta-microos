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

RPROVIDES:${PN} += "xfsdump \
xfsdump(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libattr.so.1()(64bit) \
libattr.so.1(ATTR_1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libhandle.so.1()(64bit) \
libhandle.so.1(LIBHANDLE_1.0.3)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
