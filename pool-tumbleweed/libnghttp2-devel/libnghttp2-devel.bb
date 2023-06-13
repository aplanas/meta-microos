SUMMARY = "Development files for nghttp2"
DESCRIPTION = "Development files for usage with libnghttp2, which implements \
Hypertext Transfer Protocol version 2."
LICENSE = "MIT"

PV = "1.53.0"

RPM_NAME = "libnghttp2-devel-1.53.0-1.1.aarch64.rpm"
RPM_HASH = "93edb0a4d5644b27ac09730d3be1ff33b77f84923664e86d11c89987e99e0e8f3e706c5717e0968a0f1a3aceec5c817e04ab69b127bdf9d699ea26a180ab8e16"

RPROVIDES:${PN} += "libnghttp2-devel \
libnghttp2-devel(aarch-64) \
nghttp2-devel \
pkgconfig(libnghttp2)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnghttp2-14"

inherit rpm
