SUMMARY = "Development Files for OpenColorIO"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using OpenColorIO."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "OpenColorIO-devel-2.1.2-4.1.aarch64.rpm"
RPM_HASH = "89071c2a2dc3a25f29c86d5a329e798c4568cfa6b0d80603b2540fea72f33e8c4292e4d8fc8eb949277220a0464e2812953af0f120cb8d8510169896de604bb8"

RPROVIDES:${PN} += "OpenColorIO-devel \
cmake-OpenColorIO \
pkgconfig-OpenColorIO"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOpenColorIO2-1"

inherit rpm
