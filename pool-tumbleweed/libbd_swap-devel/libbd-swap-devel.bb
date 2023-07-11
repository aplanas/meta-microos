SUMMARY = "Development files for the libblockdev-swap plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_swap plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_swap-devel-2.28-1.6.aarch64.rpm"
RPM_HASH = "8a579f3ad0b36b501cbefe85ef7bb830c3b7867ece3e7dbf09881c01829a0433ae38269b68c71bc15c33b90f9592b014db4f01f4c8772428f84d36ce6245fd43"

RPROVIDES:${PN} += "libbd-swap-devel \
libblockdev-swap-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-swap2 \
libbd-utils-devel"

inherit rpm
