SUMMARY = "A collection of analyses plugins for Rivet"
DESCRIPTION = "The Rivet project (Robust Independent Validation of Experiment and \
Theory) is a toolkit for validation of Monte Carlo event generators. \
It provides a large (and ever growing) set of experimental analyses \
useful for MC generator development, validation, and tuning, as well \
as a convenient infrastructure for adding your own analyses. Rivet is \
the most widespread way by which analysis code from the LHC and other \
high-energy collider experiments is preserved for comparison to and \
development of future theory models. \
 \
This package provides all the analysis plugins for Rivet."
LICENSE = "GPL-2.0-only"

PV = "3.1.7"

RPM_NAME = "Rivet-plugins-3.1.7-1.1.aarch64.rpm"
RPM_HASH = "f5c8153cd47b5a106e087d195257297f15532337ae8d4a2dd24a9ef726a82d97535caaf9f4b9993d5cd748c58f37b4ad84f21fae9c721dad195466dd42efd740"

RPROVIDES:${PN} += "Rivet-plugins Rivet-plugins(aarch-64) config(Rivet-plugins)"
RDEPENDS:${PN} += "Rivet-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libRivet-3.1.7.so()(64bit) libc.so.6(GLIBC_2.32)(64bit) libfastjet.so.0()(64bit) libfastjetcontribfragile.so()(64bit) libfastjetplugins.so.0()(64bit) libfastjettools.so.0()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgmp.so.10()(64bit) libgomp.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libsiscone.so.0()(64bit) libsiscone_spherical.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
