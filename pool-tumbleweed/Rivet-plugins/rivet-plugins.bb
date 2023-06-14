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

RPROVIDES:${PN} += "Rivet-plugins \
config-Rivet-plugins"

RDEPENDS:${PN} += "Rivet-devel \
ld-linux-aarch64.so.1 \
libRivet-3.1.7.so \
libc.so.6 \
libfastjet.so.0 \
libfastjetcontribfragile.so \
libfastjetplugins.so.0 \
libfastjettools.so.0 \
libgcc-s.so.1 \
libgmp.so.10 \
libgomp.so.1 \
libm.so.6 \
libsiscone-spherical.so.0 \
libsiscone.so.0 \
libstdc++.so.6"

inherit rpm
