SUMMARY = "Development files for podofo"
DESCRIPTION = "This package contains development files for podofo library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.8"

RPM_NAME = "libpodofo-devel-0.9.8-1.11.aarch64.rpm"
RPM_HASH = "c08beb85794bffcb4f5155267dc18003c2e5d5bd0dd53b0b3d388c0e9b1afde84f3a34f5ad74d325a5d2e58e14a8cd7f00843d4ac551e54570e3ff0ace9afbf5"

RPROVIDES:${PN} += "libpodofo-devel \
pkgconfig-libpodofo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libboost-headers-devel \
libpodofo0-9-8"

inherit rpm
