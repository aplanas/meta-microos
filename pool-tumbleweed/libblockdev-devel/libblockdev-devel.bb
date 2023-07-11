SUMMARY = "Development files for the LibBlockDev library"
DESCRIPTION = "This package provides header files, pkg-config modules and API documentation needed for \
development with the LibBlockDev library."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libblockdev-devel-2.28-1.6.aarch64.rpm"
RPM_HASH = "ca813e95c825b598efbdee9d6b22c18d16275e9595333453c39d6d37bad3bfeb063205f67f4c09be4497f4ed62366cca46a2d51da4dd7e5f7e09ef42e61cbe59"

RPROVIDES:${PN} += "libblockdev-devel \
pkgconfig-blockdev"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libblockdev2 \
pkgconfig-glib-2.0"

inherit rpm
