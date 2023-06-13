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

RPM_NAME = "libRivet-3_1_7-3.1.7-1.1.aarch64.rpm"
RPM_HASH = "2cff8c7df7a410c554764802d1ab63b8ba274a2016ebf6890c58227d8d5eccf0519057f32cccd83dc6b0d68afba725188e8b039aa97b2f2a9db3ae7b1d652028"

RPROVIDES:${PN} += "libRivet-3.1.7.so()(64bit) \
libRivet-3_1_7 \
libRivet-3_1_7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libHepMC3.so.3()(64bit) \
libHepMC3search.so.4()(64bit) \
libYODA-1.9.7.so()(64bit) \
libc.so.6()(64bit) \
libfastjet.so.0()(64bit) \
libfastjetplugins.so.0()(64bit) \
libfastjettools.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgmp.so.10()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
