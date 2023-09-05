SUMMARY = "Development files for libavif"
DESCRIPTION = "This library aims to be a friendly, portable C implementation of the AV1 Image \
File Format, as described here: \
 \
https://aomediacodec.github.io/av1-avif/ \
 \
This package holds the development files for libavif."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "libavif-devel-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "c40e856ae6bcf4bf8b6d948cbbab154282c396979da4f1a6a3dc81f1b400343e9bba59ce4e9dc538c924175017bf43095b10ef789832fa04134c17921f2f3651"

RPROVIDES:${PN} += "cmake-libavif \
libavif-devel \
pkgconfig-libavif"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavif16"

inherit rpm
