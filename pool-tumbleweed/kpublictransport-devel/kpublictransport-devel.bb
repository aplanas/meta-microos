SUMMARY = "Library for querying public transport data"
DESCRIPTION = "A library for access realtime public transport data and for performing public \
ransport journey queries.Development files."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kpublictransport-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "c70942508cbd821205d4c745d411a55d2cf11cc5ff87850748d4448802d3646fb95ba684fd257525b6136c076a81a6140d2df480cf87a8a3283b63cada4e48f6"

RPROVIDES:${PN} += "cmake-KPublicTransport \
kpublictransport-devel"

RDEPENDS:${PN} += "cmake-Qt5Gui \
extra-cmake-modules \
libKPublicTransport1 \
libKPublicTransportOnboard1 \
pkgconfig-zlib"

inherit rpm
