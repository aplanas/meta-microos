SUMMARY = "Libraries and headers for CharLS"
DESCRIPTION = "This package contains libraries and headers for CharLS."
LICENSE = "BSD-3-Clause"

PV = "2.4.2"

RPM_NAME = "CharLS-devel-2.4.2-1.1.aarch64.rpm"
RPM_HASH = "79c5d343ada17f5e69b2b2e6a959d95688ca5480093c31e298ddcee898842c2740ea308f95edd23dc89e20789a7de8eee9a105c8efdb31f622d3f1246266c3ff"

RPROVIDES:${PN} += "CharLS-devel \
cmake-charls \
pkgconfig-charls"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcharls2"

inherit rpm
