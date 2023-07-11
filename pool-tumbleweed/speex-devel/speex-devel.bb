SUMMARY = "Development package for SpeeX"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
SpeeX library."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "speex-devel-1.2.1-1.5.aarch64.rpm"
RPM_HASH = "88d2997799f142544b4ecb41644dda9de6d630e7df2e62dd73cc970c7c139068c89e5c3a66dc2ca40e87a1df626eb3c01db1ab40627bed484d0fc308f4a94dc1"

RPROVIDES:${PN} += "libspeex-devel \
pkgconfig-speex \
speex-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspeex1 \
speexdsp-devel"

inherit rpm
