SUMMARY = "Development files for the libblockdev-loop plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_loop plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_loop-devel-2.28-1.6.aarch64.rpm"
RPM_HASH = "79372ab5054adc2161d9912a2446725bf797dee6d7165d17e982800b9a823cf658f98a9d2d7b38c0e2778f3554cd46329b455949391b4f110f146582579d9f53"

RPROVIDES:${PN} += "libbd-loop-devel \
libblockdev-loop-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-loop2 \
libbd-utils-devel"

inherit rpm
