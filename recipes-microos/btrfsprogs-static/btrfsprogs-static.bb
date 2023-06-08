SUMMARY = "Static build of utilities for the Btrfs filesystem"
DESCRIPTION = "Static build of utilities needed to create and maintain btrfs file systems \
under Linux. Suitable for limited or rescue environments. \
 \
Warning: the zlib and lzo libraries are statically linked in and may lack \
important updates"
LICENSE = "GPL-2.0-only"

PV = "6.1.3"

RPM_NAME = "btrfsprogs-static-6.1.3-5.1.aarch64.rpm"
RPM_HASH = "169426e8fa1e0b69591f89e21414e2534c4c167b9ad9ff796917625f28a2a8acabfe11c823f40d234800faa7d2d817775c9889320d5fcaa23ece60348cdd12c9"

RPROVIDES:${PN} += "btrfs-progs-static btrfs-progs-static(aarch64) btrfsprogs-static btrfsprogs-static(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
