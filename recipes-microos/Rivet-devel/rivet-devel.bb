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

RPM_NAME = "Rivet-devel-3.1.7-1.1.aarch64.rpm"
RPM_HASH = "c5f78124a349e07ca076076c3b3f20dacb0d3cfcc9e51c702f5e1ed737ff6c751cc6130ca7dc0f588154412b00c707e5dc6710e7e82ee272c689fcb32dbf844a"

RPROVIDES:${PN} += "Rivet-devel Rivet-devel(aarch-64) pkgconfig(rivet)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/pkg-config Rivet-data YODA-devel libRivet-3_1_7"

inherit rpm
