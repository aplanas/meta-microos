SUMMARY = "NTFS Support in Userspace -- Library"
DESCRIPTION = "NTFS-3G allows for read/write access to NTFS partitions which can be \
shared with Windows XP, Windows Server 2003, Windows 2000, Windows \
Vista and Windows Seven."
LICENSE = "LGPL-2.1-or-later"

PV = "2022.10.3"

RPM_NAME = "libntfs-3g89-2022.10.3-2.5.aarch64.rpm"
RPM_HASH = "b4f79885986f97ead0fa72f12b81a326052f06ef731e8871d6497947144ebf01f989985a9899efcee539e5643c25800b16357a1086c3a1aad2f1da6fe3186f34"

RPROVIDES:${PN} += "libntfs-3g.so.89 \
libntfs-3g89"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhd.so.23"

inherit rpm
