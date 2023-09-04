SUMMARY = "Tools to access the Mac OS Hierarchical File System (HFS)"
DESCRIPTION = "Tools to access the Mac OS Hierarchical File System (HFS). See \
libfshfs for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20220831"

RPM_NAME = "libfshfs-tools-20220831-4.1.aarch64.rpm"
RPM_HASH = "f20dee62074199493d3e1ad71181648892f4f9ae5cdf1897a43e4528eeaa3fed1a1eae95f8bdad50f3535512ac785968671cb5fbdcba509330737d75a4f2b455"

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
