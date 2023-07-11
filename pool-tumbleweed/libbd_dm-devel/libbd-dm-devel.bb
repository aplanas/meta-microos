SUMMARY = "Development files for the libbd_dm plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_dm plugin/library.."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_dm-devel-2.28-1.6.aarch64.rpm"
RPM_HASH = "d41154e32417335c903eabcf5a68490a42504d882b5df8fc276b41133b18259f326d3dfb2647080db55c30649ac9088fa027d0d6345fa3de3594f3db799b15a7"

RPROVIDES:${PN} += "libbd-dm-devel \
libblockdev-dm-devel"

RDEPENDS:${PN} += "device-mapper-devel \
dmraid-devel \
glib2-devel \
libbd-dm2 \
libbd-utils-devel \
systemd-devel"

inherit rpm
