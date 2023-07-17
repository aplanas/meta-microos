SUMMARY = "Tools to access the Mac OS Hierarchical File System (HFS)"
DESCRIPTION = "Tools to access the Mac OS Hierarchical File System (HFS). See \
libfshfs for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20220831"

RPM_NAME = "libfshfs-tools-20220831-3.14.aarch64.rpm"
RPM_HASH = "457b40f570b99bcfd77dccb8cae876f178edd70e6be5307a15fbd7e176d3a23067575a23d112c0d8f85dc31beaecefd43d09b258a0d0910317d92db77ddb2aa9"

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
