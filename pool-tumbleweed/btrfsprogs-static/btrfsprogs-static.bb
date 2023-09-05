SUMMARY = "Static build of utilities for the Btrfs filesystem"
DESCRIPTION = "Static build of utilities needed to create and maintain btrfs file systems \
under Linux. Suitable for limited or rescue environments. \
 \
Warning: the zlib and lzo libraries are statically linked in and may lack \
important updates"
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "btrfsprogs-static-6.3-3.1.aarch64.rpm"
RPM_HASH = "f079a967cac76e29083df8046bb4b5bd6724664e0fbe5aade662a0ab16340f409e885050de28f5e6d3f78d449c0fe3c760f6760a3aa2cf75fa7ecd3cdfa79183"

RPROVIDES:${PN} += "btrfs-progs-static \
btrfs-progs-static-aarch64 \
btrfsprogs-static"

RDEPENDS:${PN} += ""

inherit rpm
