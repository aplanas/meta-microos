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

PV = "3.1.7"

RPM_NAME = "Rivet-devel-3.1.7-1.2.aarch64.rpm"
RPM_HASH = "db7e9bb070edced672c81bf9b5eec1b0f97a2d2f816ee6c29611b26772785b57aaded75258f9173bfa03e241b2cafb40a446109202c9909f8dcb6696bb8f97a0"

RPROVIDES:${PN} += "Rivet-devel \
pkgconfig-rivet"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
Rivet-data \
YODA-devel \
libRivet-3-1-7"

inherit rpm
