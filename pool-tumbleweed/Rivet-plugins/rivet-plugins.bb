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

RPM_NAME = "Rivet-plugins-3.1.7-1.2.aarch64.rpm"
RPM_HASH = "b969950894b42cbac2bd2673fef5c2706769ad50c798007a0349561a03154e77f9b268b3d65a79bddc0cd9208ae47f1b43757088ca07710de6517fd0ec3436af"

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
