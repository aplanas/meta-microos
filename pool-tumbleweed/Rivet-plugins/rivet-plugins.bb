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

PV = "3.1.8"

RPM_NAME = "Rivet-plugins-3.1.8-1.1.aarch64.rpm"
RPM_HASH = "92a4c1ae561ace7c45d8ff3cb4aa69d5b12257117c545c4fdab7502af83a7b9bbdf3803f3bb32b29469858f74821fb0415cf63011f8f94050cd45f1acb5c8460"

RPROVIDES:${PN} += "Rivet-plugins \
config-Rivet-plugins"

RDEPENDS:${PN} += "Rivet-devel \
ld-linux-aarch64.so.1 \
libRivet-3.1.8.so \
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
