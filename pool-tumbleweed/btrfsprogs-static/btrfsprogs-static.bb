SUMMARY = "Static build of utilities for the Btrfs filesystem"
DESCRIPTION = "Static build of utilities needed to create and maintain btrfs file systems \
under Linux. Suitable for limited or rescue environments. \
 \
Warning: the zlib and lzo libraries are statically linked in and may lack \
important updates"
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "btrfsprogs-static-6.3-2.2.aarch64.rpm"
RPM_HASH = "499b58554eefd7f578e6f51ca2ce42f5dfd41558184946c11144ac452a677bf667c09b20c9474244e32e119ca5c42f97a94da62a2ce652beef0a9cb2bd2ca854"

RPROVIDES:${PN} += "btrfs-progs-static \
btrfs-progs-static-aarch64 \
btrfsprogs-static"

RDEPENDS:${PN} += ""

inherit rpm
