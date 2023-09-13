SUMMARY = "Static build of utilities for the Btrfs filesystem"
DESCRIPTION = "Static build of utilities needed to create and maintain btrfs file systems \
under Linux. Suitable for limited or rescue environments. \
 \
Warning: the zlib and lzo libraries are statically linked in and may lack \
important updates"
LICENSE = "GPL-2.0-only"

PV = "6.5"

RPM_NAME = "btrfsprogs-static-6.5-1.1.aarch64.rpm"
RPM_HASH = "62cf87941aad6f695bdbb4ce3fcc674012d4a3039592f77742d9d1bbf06cff768e6251940f0f5aa0ff0af1272a8f525458bbd3b307a558a4c8485f9a19c9d3d1"

RPROVIDES:${PN} += "btrfs-progs-static \
btrfs-progs-static-aarch64 \
btrfsprogs-static"

RDEPENDS:${PN} += ""

inherit rpm
