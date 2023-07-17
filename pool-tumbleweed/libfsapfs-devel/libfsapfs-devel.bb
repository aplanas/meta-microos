SUMMARY = "Development files for libfsapfs"
DESCRIPTION = "Development files for libfsapfs."
LICENSE = "LGPL-3.0-only"

PV = "20230617"

RPM_NAME = "libfsapfs-devel-20230617-1.4.aarch64.rpm"
RPM_HASH = "e766b1280adb63d5858264cd779a0eb222a423c2fa39e8063d4ebc34dd07b540aa3d72e721b0faaebc422b5bec8156bda27d8dee1df0e373bcf13c8e161e17a1"

RPROVIDES:${PN} += "libfsapfs-devel \
pkgconfig-libfsapfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsapfs1"

inherit rpm
