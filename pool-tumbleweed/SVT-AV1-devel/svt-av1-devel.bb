SUMMARY = "Development files for SVT-AV1"
DESCRIPTION = "An AV1 encoder for video streams from Intel. \
 \
This package contains the header files for svt-av1."
LICENSE = "BSD-3-Clause-Clear"

PV = "1.6.0"

RPM_NAME = "SVT-AV1-devel-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "0b682e0a06c8e6c8475c7c854c26d0dd711e4f0334f586662b0df3d1a7a2492d7f906a77111b03b1f72e69913ebff5a889ccc4b0aaec22c4ea2ba4931f74590e"

RPROVIDES:${PN} += "SVT-AV1-devel \
pkgconfig-SvtAv1Dec \
pkgconfig-SvtAv1Enc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSvtAv1Dec0 \
libSvtAv1Enc1"

inherit rpm
