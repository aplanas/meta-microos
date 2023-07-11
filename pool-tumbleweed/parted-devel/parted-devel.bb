SUMMARY = "Parted Include Files and Libraries necessary for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-3.0-or-later"

PV = "3.5"

RPM_NAME = "parted-devel-3.5-4.5.aarch64.rpm"
RPM_HASH = "548ab3288025a92af7d40b83c5f184303ca21de8bb315a3a09c2e77adf69923baf2b21f181ddb3606ea71c25592c1457ae3d9471285c1d88e2424d87febfabf4"

RPROVIDES:${PN} += "parted-devel \
pkgconfig-libparted \
pkgconfig-libparted-fs-resize"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
device-mapper-devel \
libparted-fs-resize0 \
libparted2"

inherit rpm
