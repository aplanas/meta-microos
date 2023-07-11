SUMMARY = "Development files for libxcam"
DESCRIPTION = "The libxcam-devel package contains libraries and header files for \
developing applications that use libxcam."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "libxcam-devel-1.5.0-4.6.aarch64.rpm"
RPM_HASH = "a967c1f7a9d1e45c6c186ab6f3dc8e4bd549ee3e341b03f078512745451af91b1c3fa35566ff4f2eafe9c9926983e6a3e6f3f2b206850754c522c4a21cb86446"

RPROVIDES:${PN} += "libxcam-devel \
pkgconfig-libxcam"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcam1"

inherit rpm
