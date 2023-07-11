SUMMARY = "Development files for the libblockdev-part plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_part plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_part-devel-2.28-1.6.aarch64.rpm"
RPM_HASH = "2fc6d995a9c2989e9fd5c79306f5168405502d8f0c4f1a60a316aa82c4306c10f699391e4f85b7834042d4c995320d531be4dcb67b5b244ab04e6cb4c513f3f2"

RPROVIDES:${PN} += "libbd-part-devel \
libblockdev-part-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-part2 \
libbd-utils-devel"

inherit rpm
