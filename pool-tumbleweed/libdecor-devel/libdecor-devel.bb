SUMMARY = "Development files for libdecor"
DESCRIPTION = "Libraries and header files for developing applications that target libdecor."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "libdecor-devel-0.1.1-1.3.aarch64.rpm"
RPM_HASH = "24ce4709609f27be9d3118e55b0b2fda01478028817491b531803ac5044933effefa2d7d061865d996e88d1d85fc6b22641e5a439a1f2aa1292b7785d16befa9"

RPROVIDES:${PN} += "libdecor-devel \
pkgconfig-libdecor-0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdecor-0-0 \
pkgconfig-wayland-client"

inherit rpm
