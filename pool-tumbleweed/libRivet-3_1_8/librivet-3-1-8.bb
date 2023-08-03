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

RPM_NAME = "libRivet-3_1_8-3.1.8-1.1.aarch64.rpm"
RPM_HASH = "63e34467f5214d240978c31e45637911896e78b63b0d09642f2b266196fa6bd262e439a368eae01e0b0262c31a46e4e02b37df7f9ebf9d94881d213a321829a6"

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
