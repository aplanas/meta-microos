SUMMARY = "Library for querying public transport data"
DESCRIPTION = "A library for access realtime public transport data and for performing public \
ransport journey queries.Development files."
LICENSE = "LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kpublictransport-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "2ea6b724ffc1e580f4567dd512f7f7c6bffda763163247eaff83543e092094211d57acfc08b8dc2e539357adb7b1808283959935754acd5535b9e502753b5cfb"

RPROVIDES:${PN} += "cmake-KPublicTransport \
kpublictransport-devel"

RDEPENDS:${PN} += "cmake-Qt5Gui \
extra-cmake-modules \
libKPublicTransport1 \
libKPublicTransportOnboard1 \
pkgconfig-zlib"

inherit rpm
