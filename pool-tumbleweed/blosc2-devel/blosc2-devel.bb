SUMMARY = "Development libraries for libblosc2-2"
DESCRIPTION = "This package provides development libraries and headers \
for libblosc2-2."
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"

PV = "2.10.2"

RPM_NAME = "blosc2-devel-2.10.2-1.1.aarch64.rpm"
RPM_HASH = "a556bb60f9cb05cf4499c09884c35aa293394d4a683f983e31a128cf6663ca332bf40ffdbf2e067df0f5290e3d26bae937ebf450277e71f596b8e3d9106271b7"

RPROVIDES:${PN} += "blosc2-devel \
cmake-Blosc2 \
pkgconfig-blosc2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblosc2-2"

inherit rpm
