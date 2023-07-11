SUMMARY = "NTFS Support in Userspace"
DESCRIPTION = "NTFS-3G allows for read/write access to NTFS partitions which can be \
shared with Windows XP, Windows Server 2003, Windows 2000, Windows \
Vista and Windows Seven."
LICENSE = "GPL-2.0-or-later"

PV = "2022.10.3"

RPM_NAME = "ntfs-3g-2022.10.3-2.5.aarch64.rpm"
RPM_HASH = "f63414fde5bc8e8e83e6910d2e8ca0af239659723bdcb578d6aa4090f6db2e096bdb53cf1a80418473bf50ba25842e847bc033a9c1672ce4dc4d567374673063"

RPROVIDES:${PN} += "ntfs-3g \
ntfsprogs-fuse"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
libntfs-3g.so.89 \
update-alternatives"

inherit rpm
