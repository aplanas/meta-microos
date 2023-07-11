SUMMARY = "Development files for libfsapfs"
DESCRIPTION = "Development files for libfsapfs."
LICENSE = "LGPL-3.0-only"

PV = "20230617"

RPM_NAME = "libfsapfs-devel-20230617-1.3.aarch64.rpm"
RPM_HASH = "0695b047d6e34065d6c2eb324726609f0fe7db47182413a3b6dcf2f47781df2656257e14ce732c8a82a1549e181f9b25616927f233d52d096edd2ee3dbff6af4"

RPROVIDES:${PN} += "libfsapfs-devel \
pkgconfig-libfsapfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsapfs1"

inherit rpm
