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

PV = "3.1.7"

RPM_NAME = "libRivet-3_1_7-3.1.7-1.2.aarch64.rpm"
RPM_HASH = "746bb60ee07c1da97efbeadf022b65f6c187ffac67a7204f5a815c9234b1f99b6a6bdf5c994164963c3d2a1dae949618b268be394473aa7beee547d56652798f"

RPROVIDES:${PN} += "libRivet-3-1-7 \
libRivet-3.1.7.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libHepMC3.so.3 \
libHepMC3search.so.4 \
libYODA-1.9.7.so \
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
