SUMMARY = "Tools to access the Mac OS Hierarchical File System (HFS)"
DESCRIPTION = "Tools to access the Mac OS Hierarchical File System (HFS). See \
libfshfs for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20220831"

RPM_NAME = "libfshfs-tools-20220831-3.9.aarch64.rpm"
RPM_HASH = "9f0ca27a890bfb098b2bd55b4c3045eede54c4c7c3304d7d89ef73f82942fb74cfa74689e07af81962cd5f9ffea64e18282276f09c87abe749dd90fb94fd857a"

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
