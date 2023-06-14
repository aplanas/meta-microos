SUMMARY = "Development files for libharu"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use libharu."
LICENSE = "Zlib"

PV = "2.4.2"

RPM_NAME = "libharu-devel-2.4.2-1.3.aarch64.rpm"
RPM_HASH = "622de983cf1e34ca061c93b410a8cc4e573ecf53ac38c0da05720054f037ee6955731c1a7bebade1508a64915680dbb30724b7703120f56e83758d74e26954f9"

RPROVIDES:${PN} += "libharu-devel"

RDEPENDS:${PN} += "libhpdf2-4-2 \
libpng-devel \
zlib-devel"

inherit rpm
