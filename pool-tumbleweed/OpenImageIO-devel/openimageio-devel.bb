SUMMARY = "Development Files for OpenImageIO"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using OpenImageIO."
LICENSE = "BSD-3-Clause"

PV = "2.4.12.0"

RPM_NAME = "OpenImageIO-devel-2.4.12.0-1.2.aarch64.rpm"
RPM_HASH = "aa629518a51cb1446529f3ff2dd5d371528bdcadee9f337c955758311745aff54ff4edae9fa29ec71d4bf0bedb8ab5cd8709b3b328819dea658953bc29d29692"

RPROVIDES:${PN} += "OpenImageIO-devel \
cmake-OpenImageIO \
pkgconfig-OpenImageIO"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
fmt-devel \
libOpenImageIO-Util2-4 \
libOpenImageIO2-4"

inherit rpm
