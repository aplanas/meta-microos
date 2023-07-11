SUMMARY = "Development files for pangomm, a C++ API for Pango"
DESCRIPTION = "pangomm provides a C++ interface to the pango library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.50.1"

RPM_NAME = "pangomm-devel-2.50.1-1.4.aarch64.rpm"
RPM_HASH = "897ce9f8c348e1813f7d47829bfa2e059dc0e0016ab1b4b4a8d6bd9477faa51b17003e8f7a966fb115243cb0530b8d6224cff91dcaf8929a5c6a407bf8caab2b"

RPROVIDES:${PN} += "pangomm-devel \
pkgconfig-pangomm-2.48"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpangomm-2-48-1 \
pkgconfig-cairomm-1.16 \
pkgconfig-giomm-2.68 \
pkgconfig-pangocairo"

inherit rpm
