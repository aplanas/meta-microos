SUMMARY = "Development Files for projectM"
DESCRIPTION = "projectM is a music visualizer. \
This package contains its development files."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.12"

RPM_NAME = "projectM-devel-3.1.12-1.13.aarch64.rpm"
RPM_HASH = "f467a11df9f0779d0b082bd1a697357e892984d63d692ff1b2e6a49985f19d1db841d648bf6d28f2b4ea43c87b7f514bd8ce40f06b17dad6b8feae3dc841160f"

RPROVIDES:${PN} += "pkgconfig-libprojectM \
projectM-devel \
projectM-qt5-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libprojectM3 \
projectM \
projectM-data"

inherit rpm
