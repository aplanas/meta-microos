SUMMARY = "NTFS Support in Userspace"
DESCRIPTION = "NTFS-3G allows for read/write access to NTFS partitions which can be \
shared with Windows XP, Windows Server 2003, Windows 2000, Windows \
Vista and Windows Seven."
LICENSE = "GPL-2.0-or-later"

PV = "2022.10.3"

RPM_NAME = "ntfs-3g-2022.10.3-2.3.aarch64.rpm"
RPM_HASH = "2e3e720c01355d8a5459cca8f3fa14062e1b636acc4f033d529a6e92a7390822c77cc62ad0a03fccf05b2d38c27ba24e01676cbaf7be0e278c6e4a067d0f7d7c"

RPROVIDES:${PN} += "ntfs-3g \
ntfs-3g(aarch-64) \
ntfsprogs-fuse"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.2)(64bit) \
libfuse.so.2(FUSE_2.4)(64bit) \
libfuse.so.2(FUSE_2.5)(64bit) \
libfuse.so.2(FUSE_2.6)(64bit) \
libfuse.so.2(FUSE_2.7)(64bit) \
libfuse.so.2(FUSE_2.7.5)(64bit) \
libfuse.so.2(FUSE_2.8)(64bit) \
libntfs-3g.so.89()(64bit) \
update-alternatives"

inherit rpm
