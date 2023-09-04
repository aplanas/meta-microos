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
This package provides the shared libraries for Rivet."
LICENSE = "GPL-2.0-only"

PV = "3.1.8"

RPM_NAME = "libRivet-3_1_8-3.1.8-1.2.aarch64.rpm"
RPM_HASH = "1050fd4129235b20c15fafdd1fc38406fb0e73dfd9951e92b0e5936b78a94ded89921cd4e55fbfbfaaf409267193cb6b879c0cb9bdb57f0b8de8d2681e18e70d"

RPROVIDES:${PN} += "libRivet-3-1-8 \
libRivet-3.1.8.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libHepMC3.so.3 \
libHepMC3search.so.5 \
libYODA-1.9.8.so \
libc.so.6 \
libfastjet.so.0 \
libfastjetplugins.so.0 \
libfastjettools.so.0 \
libgcc-s.so.1 \
libgmp.so.10 \
libgomp.so.1 \
libm.so.6 \
libz.so.1"

inherit rpm
