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

RPM_NAME = "Rivet-devel-3.1.8-1.2.aarch64.rpm"
RPM_HASH = "1dbe01a38e8d6c5939350a0f5583f33018499cac6359fe519b39bbdb9ff2a08dd9ec170f41651192d8d39cc6713f4c010e47e3ebec015e0541e6f10097bea696"

RPROVIDES:${PN} += "Rivet-devel \
pkgconfig-rivet"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
Rivet-data \
YODA-devel \
libRivet-3-1-8"

inherit rpm
