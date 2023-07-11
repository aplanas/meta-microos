SUMMARY = "Development Files for OpenColorIO"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using OpenColorIO."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "OpenColorIO-devel-2.1.2-3.2.aarch64.rpm"
RPM_HASH = "d463f6d87b95ca01ad7b29f7fee1a58cbd3e3dc42f95b3fe37a0e06f5941e14018fea46f0bf2a100612da98af346de6564534e4ade489e771a5c8b02033fcb23"

RPROVIDES:${PN} += "OpenColorIO-devel \
cmake-OpenColorIO \
pkgconfig-OpenColorIO"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOpenColorIO2-1"

inherit rpm
