SUMMARY = "Development files for the libblockdev-mdraid plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_mdraid plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_mdraid-devel-2.28-1.6.aarch64.rpm"
RPM_HASH = "050b3440c4010abcfffd61a8e52a69d92c0d286ef7b4998939dc3eb9817364b015860fcf847998fbf37ee2432d90b181a37450d24b722c953dc06ddf92d7c3a3"

RPROVIDES:${PN} += "libbd-mdraid-devel \
libblockdev-mdraid-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-mdraid2 \
libbd-utils-devel"

inherit rpm
