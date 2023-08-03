SUMMARY = "Development files for libfsapfs"
DESCRIPTION = "Development files for libfsapfs."
LICENSE = "LGPL-3.0-only"

PV = "20230617"

RPM_NAME = "libfsapfs-devel-20230617-2.1.aarch64.rpm"
RPM_HASH = "74369c7db9448cbc1de2c91f041d64e4013609adbc806f830815152e24172d1af666f9e6e0c97a8463999dc5b6a82ab2b5da9f3673489438b8576397434537ff"

RPROVIDES:${PN} += "libfsapfs-devel \
pkgconfig-libfsapfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsapfs1"

inherit rpm
