SUMMARY = "Development files for libavif"
DESCRIPTION = "This library aims to be a friendly, portable C implementation of the AV1 Image \
File Format, as described here: \
 \
https://aomediacodec.github.io/av1-avif/ \
 \
This package holds the development files for libavif."
LICENSE = "BSD-2-Clause"

PV = "0.11.1"

RPM_NAME = "libavif-devel-0.11.1-2.1.aarch64.rpm"
RPM_HASH = "ea5a6cb9ea3092f83d4b4a5b9912496ce143dae5df9ee6121f56571ece9835c93945aa6e830b3b40d6e6eb5ce2f747c3d495e261a4550fcb58856f6b8b08f85d"

RPROVIDES:${PN} += "cmake-libavif \
libavif-devel \
pkgconfig-libavif"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavif15"

inherit rpm
