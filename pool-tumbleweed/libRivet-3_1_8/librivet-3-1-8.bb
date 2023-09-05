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
LICENSE = "GPL-2.0-only & Apache-2.0 & MPL-2.0 & LPPL-1.3a & BSL-1.0"

PV = "3.1.8"

RPM_NAME = "libRivet-3_1_8-3.1.8-2.1.aarch64.rpm"
RPM_HASH = "fa18967c4f27cdb9bc576faeb8dd627d859532ab485c1de74fdfb823f55549f599f030ea63ed86c7fcab1e4f2eb60767d97d7d284412e574cc46fc17c2005f78"

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
