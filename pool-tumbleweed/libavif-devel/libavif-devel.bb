SUMMARY = "Development files for libavif"
DESCRIPTION = "This library aims to be a friendly, portable C implementation of the AV1 Image \
File Format, as described here: \
 \
https://aomediacodec.github.io/av1-avif/ \
 \
This package holds the development files for libavif."
LICENSE = "BSD-2-Clause"

PV = "0.11.1"

RPM_NAME = "libavif-devel-0.11.1-2.2.aarch64.rpm"
RPM_HASH = "6d323ec9fe9c6e4b00af2e1295e4bd37065cca1603caf1859f1fc2ded819d90c83d1f27bc4ff66a8e1f5f6b7f3e9a36df5cc418f06b66ea74798e2b593783f03"

RPROVIDES:${PN} += "cmake-libavif \
libavif-devel \
pkgconfig-libavif"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavif15"

inherit rpm
