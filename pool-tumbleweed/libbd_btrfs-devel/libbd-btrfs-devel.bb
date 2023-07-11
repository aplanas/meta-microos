SUMMARY = "Development files for the libbd_btrfs plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_btrfs plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_btrfs-devel-2.28-1.6.aarch64.rpm"
RPM_HASH = "139be26547b2b4dff3f224c6a6dbec65cfa3f937efc19a0e8b13985fdd7088be4d231acef97dc4aa1dbf252df3f11ffe13a087e403f24844e08607fbcbd71fa2"

RPROVIDES:${PN} += "libbd-btrfs-devel \
libblockdev-btrfs-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-btrfs2 \
libbd-utils-devel"

inherit rpm
