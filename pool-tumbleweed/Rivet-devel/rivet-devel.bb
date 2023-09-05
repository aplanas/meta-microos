SUMMARY = "A toolkit for validation of Monte Carlo event generators"
DESCRIPTION = "The Rivet project (Robust Independent Validation of Experiment and \
Theory) is a toolkit for validation of Monte Carlo event generators. \
It provides a large (and ever growing) set of experimental analyses \
useful for MC generator development, validation, and tuning, as well \
as a convenient infrastructure for adding your own analyses. Rivet is \
the most widespread way by which analysis code from the LHC and other \
high-energy collider experiments is preserved for comparison to and \
development of future theory models. \
 \
This package provides the source files for development with Rivet."
LICENSE = "GPL-2.0-only & Apache-2.0 & MPL-2.0 & LPPL-1.3a & BSL-1.0"

PV = "3.1.8"

RPM_NAME = "Rivet-devel-3.1.8-2.1.aarch64.rpm"
RPM_HASH = "e9bb4f9d86b1ec7361c28f82d8333ed08bdcc8c1070cc50853fc3e47709cbbf92ddb940245d068fdd973ad254fd46f7c8dd5c7705e71c5857faf54f527c8f029"

RPROVIDES:${PN} += "Rivet-devel \
pkgconfig-rivet"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
Rivet-data \
YODA-devel \
libRivet-3-1-8"

inherit rpm
