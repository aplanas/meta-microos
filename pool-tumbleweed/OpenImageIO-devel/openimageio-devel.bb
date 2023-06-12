SUMMARY = "Development Files for OpenImageIO"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using OpenImageIO."
LICENSE = "BSD-3-Clause"

PV = "2.4.12.0"

RPM_NAME = "OpenImageIO-devel-2.4.12.0-1.1.aarch64.rpm"
RPM_HASH = "c8dc9d865c471161d42c681b6bb1049768b37c1a3fabbaef33ffa51080569a44724986d9fe6feb8e2ffe331f6d64204808adcf9850be8fc304a04f976ef582f2"

RPROVIDES:${PN} += "OpenImageIO-devel \
OpenImageIO-devel(aarch-64) \
cmake(OpenImageIO) \
pkgconfig(OpenImageIO)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
fmt-devel \
libOpenImageIO2_4 \
libOpenImageIO_Util2_4"

inherit rpm
