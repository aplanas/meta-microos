SUMMARY = "Tools to access the Mac OS Hierarchical File System (HFS)"
DESCRIPTION = "Tools to access the Mac OS Hierarchical File System (HFS). See \
libfshfs for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20220831"

RPM_NAME = "libfshfs-tools-20220831-3.13.aarch64.rpm"
RPM_HASH = "1d59c3474d489890d4871aad08fd38e62246cc5980c5a8274516f760ff06d02eb922fe7177b4a3c3260b7f79b88172d95897a1f74f36b0a99394102bd623776a"

RPROVIDES:${PN} += "libfshfs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfshfs.so.1 \
libfshfs1 \
libfuse.so.2 \
libhmac.so.1 \
libuna.so.1"

inherit rpm
