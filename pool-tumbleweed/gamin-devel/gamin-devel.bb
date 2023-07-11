SUMMARY = "Libraries and includes to build against gamin"
DESCRIPTION = "Libraries, includes, etc. to use and build against gamin."
LICENSE = "LGPL-2.1-only"

PV = "0.1.10"

RPM_NAME = "gamin-devel-0.1.10-18.2.aarch64.rpm"
RPM_HASH = "e4c6cec6f6b04949eeacbfe78882cb43d8c17d1f1d15c61518ad2a23f079796991d2e2646d8da66e62f4d60494adedc9c67aa779668e74df8727b596f84177ed"

RPROVIDES:${PN} += "gamin-devel \
gamin-devel-static \
pkgconfig-gamin"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfam0-gamin \
libgamin-1-0"

inherit rpm
