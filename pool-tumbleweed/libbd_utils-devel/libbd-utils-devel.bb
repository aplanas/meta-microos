SUMMARY = "Development files for libbd_utils"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_utils library."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_utils-devel-2.28-1.4.aarch64.rpm"
RPM_HASH = "05fb4f74f288e368f8e70815de279004eae0453cfffd53ae667cecd6e468a242664fb5bab7968d531b046366a73538a42feab5119100312f19733ac5852a6947"

RPROVIDES:${PN} += "libbd-utils-devel \
pkgconfig-blockdev-utils"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libbd-utils2 \
pkgconfig-glib-2.0"

inherit rpm
