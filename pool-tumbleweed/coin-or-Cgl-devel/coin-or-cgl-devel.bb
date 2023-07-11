SUMMARY = "Development headers for coin-or-Cgl"
DESCRIPTION = "The COIN-OR Cut Generation Library (Cgl) is a collection of cut generators. \
 \
This package contains the development headers for coin-or-Cgl."
LICENSE = "EPL-2.0"

PV = "0.60.6"

RPM_NAME = "coin-or-Cgl-devel-0.60.6-1.4.aarch64.rpm"
RPM_HASH = "8769b12becaf162c06f798c2091630ad93de46bd5720f91cf22abe76663fc6fcb29ffde2803a56ce91d205b7c9468fbeeba151ef508489536ef283cb3955082e"

RPROVIDES:${PN} += "coin-or-Cgl-devel \
pkgconfig-cgl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libCgl1 \
pkgconfig-clp \
pkgconfig-coinutils \
pkgconfig-osi \
pkgconfig-osi-clp"

inherit rpm
