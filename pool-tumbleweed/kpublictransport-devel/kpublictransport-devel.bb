SUMMARY = "Library for querying public transport data"
DESCRIPTION = "A library for access realtime public transport data and for performing public \
ransport journey queries.Development files."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kpublictransport-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "1b690a9b8926d380d22f7ef3e19ec3bd499158643dcb30547b584efcb47664e83e645d3a17953436df6740bea3ee6aa2ba37a714126dcfc9fe81d6b48c9c0cba"

RPROVIDES:${PN} += "cmake-KPublicTransport \
kpublictransport-devel"

RDEPENDS:${PN} += "cmake-Qt5Gui \
extra-cmake-modules \
libKPublicTransport1 \
libKPublicTransportOnboard1 \
pkgconfig-zlib"

inherit rpm
