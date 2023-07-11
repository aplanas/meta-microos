SUMMARY = "C++ interface for pango -- Development Files"
DESCRIPTION = "pangomm provides a C++ interface to the pango library."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "2.46.3"

RPM_NAME = "pangomm1_4-devel-2.46.3-2.4.aarch64.rpm"
RPM_HASH = "a1aae249c7675507905c0ae9cd70d2e664cc1470b5cbf7727ae981c7347234cd9d2c7e67c6f2d71ecf81f5bcf04b3dc21c48e453201f284e744547e6bb46bd93"

RPROVIDES:${PN} += "pangomm1-4-devel \
pkgconfig-pangomm-1.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpangomm-1-4-1 \
pkgconfig-cairomm-1.0 \
pkgconfig-glibmm-2.4 \
pkgconfig-pangocairo"

inherit rpm
