SUMMARY = "Development files for the libblockdev-mdraid plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_mdraid plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_mdraid-devel-2.28-1.4.aarch64.rpm"
RPM_HASH = "4902dc2b41ede4fa94ed8e2b32460b94c2b97cd899586b7c0f23f579aafc936417ef938dd794fa282f7c6b583885f6bd0f44be820fdde8e8b9583864fae832d0"

RPROVIDES:${PN} += "libbd_mdraid-devel \
libbd_mdraid-devel(aarch-64) \
libblockdev-mdraid-devel"
RDEPENDS:${PN} += "glib2-devel \
libbd_mdraid2 \
libbd_utils-devel"

inherit rpm
