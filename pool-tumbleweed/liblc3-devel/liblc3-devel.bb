SUMMARY = "Low Complexity Communication Codec (LC3) - Development Files"
DESCRIPTION = "Low Complexity Communication Codec (LC3). \
The LC3 is an low latency audio codec. \
 \
This package provides all the necessary files for development with \
liblc3."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "liblc3-devel-1.0.4-1.1.aarch64.rpm"
RPM_HASH = "23127696fd3e078387ba2686ac46bebcba1e3e06ce0cf6e1bf40db381a26467c080e06e2051037a2c601db996ab60f924137b8701d89f1efba1e866d95162b47"

RPROVIDES:${PN} += "liblc3-devel \
pkgconfig-lc3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblc3-1"

inherit rpm
