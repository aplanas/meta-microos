SUMMARY = "Development files for the libbd_btrfs plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_btrfs plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_btrfs-devel-2.28-1.4.aarch64.rpm"
RPM_HASH = "3e1dc724a6e564e97b9bd05f6e7e62da636c42e90523fd07c12a8cc3f53771f005b1534e67073855896ff2bc20e6876ece1e48ac93df966901f3e547dac36315"

RPROVIDES:${PN} += "libbd_btrfs-devel \
libbd_btrfs-devel(aarch-64) \
libblockdev-btrfs-devel"
RDEPENDS:${PN} += "glib2-devel \
libbd_btrfs2 \
libbd_utils-devel"

inherit rpm
