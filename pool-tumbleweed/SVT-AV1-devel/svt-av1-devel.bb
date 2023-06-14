SUMMARY = "Development files for SVT-AV1"
DESCRIPTION = "An AV1 encoder for video streams from Intel. \
 \
This package contains the header files for svt-av1."
LICENSE = "BSD-3-Clause-Clear"

PV = "1.4.1"

RPM_NAME = "SVT-AV1-devel-1.4.1-2.1.aarch64.rpm"
RPM_HASH = "3496afe155001a7c5d0cae84461d82b7991327365855f8633aa0b7402bee78e2f8aa292ca707b09bd9609b5499183f0452060b0e621af5a7ffbfab38142b3e9c"

RPROVIDES:${PN} += "SVT-AV1-devel \
pkgconfig-SvtAv1Dec \
pkgconfig-SvtAv1Enc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSvtAv1Dec0 \
libSvtAv1Enc1"

inherit rpm
