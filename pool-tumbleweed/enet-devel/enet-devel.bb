SUMMARY = "Development files for libenet"
DESCRIPTION = "The libenet-devel package contains libraries and header files for \
developing applications that use libenet."
LICENSE = "MIT"

PV = "1.3.17"

RPM_NAME = "enet-devel-1.3.17-1.11.aarch64.rpm"
RPM_HASH = "eb0e42bd09d1f499a13914ea2bd09d46f840f4a911d10dd50239f28fa0a9fcf15e7eb323ffcba805c939d14add052237e662439f02f2d7258c0e296a3e3fc097"

RPROVIDES:${PN} += "enet-devel \
pkgconfig-libenet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libenet7"

inherit rpm
