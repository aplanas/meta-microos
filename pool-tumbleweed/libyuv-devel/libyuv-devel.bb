SUMMARY = "Development files for the YUV scaling and conversion library"
DESCRIPTION = "This package contains the development files \
for the YUV scaling and conversion library."
LICENSE = "BSD-3-Clause"

PV = "20230517+a377993"

RPM_NAME = "libyuv-devel-20230517+a377993-1.1.aarch64.rpm"
RPM_HASH = "2a97890a0a8ea447ca1bb3d64cfd7db922c7ee21009c7bf72c8f83ebc6548bd56856074c018c5aafa4f6b9bb284de6200aa4d337982a2a88a3db3b1681fd5f7f"

RPROVIDES:${PN} += "libyuv-devel \
libyuv-devel(aarch-64) \
pkgconfig(libyuv)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyuv0(aarch-64)"

inherit rpm
