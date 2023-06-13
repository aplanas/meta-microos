SUMMARY = "Development Files for libisofs"
DESCRIPTION = "Development files for developing applications using libisofs."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.5.4"

RPM_NAME = "libisofs-devel-1.5.4-2.11.aarch64.rpm"
RPM_HASH = "86b457e6449e9b8d65fa5396b48c9ad7194068b4e6b1deb90f460efe6f4dcd800536169347d3eab74d8216245f9bbe4890f8e76aa57d6628b9e31d71b25cad2c"

RPROVIDES:${PN} += "libisofs-devel \
libisofs-devel(aarch-64) \
pkgconfig(libisofs-1)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libisofs6"

inherit rpm
