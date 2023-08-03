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
LICENSE = "GPL-2.0-only"

PV = "3.1.8"

RPM_NAME = "Rivet-devel-3.1.8-1.1.aarch64.rpm"
RPM_HASH = "91cccfbc4e9e50da677e38e8ac11ceb00ea8378bc0e4f66f0a9fff9011cf67eaead40e99170173108c3a2c7dda0080688ffe798a041d5b2a17020f79da2ece97"

RPROVIDES:${PN} += "Rivet-devel \
pkgconfig-rivet"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
Rivet-data \
YODA-devel \
libRivet-3-1-8"

inherit rpm
