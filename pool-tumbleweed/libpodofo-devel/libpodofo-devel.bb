SUMMARY = "Development files for podofo"
DESCRIPTION = "This package contains development files for podofo library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.1"

RPM_NAME = "libpodofo-devel-0.10.1-1.1.aarch64.rpm"
RPM_HASH = "7fe6af16732433a2a50ba9eecac48efe1fdbaa6a92465e771dc6ca714f9fd657254bee6cbe383e09fb31413f17844bbfcbc26a494f1d8f004cfc8fd3882b61c1"

RPROVIDES:${PN} += "libpodofo-devel \
pkgconfig-libpodofo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libboost-headers-devel \
libpodofo2"

inherit rpm
