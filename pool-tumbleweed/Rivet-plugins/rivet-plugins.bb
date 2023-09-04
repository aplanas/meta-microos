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

RPM_NAME = "Rivet-plugins-3.1.8-1.2.aarch64.rpm"
RPM_HASH = "253a42468a4729e81617acdc655b1c6de995f0e476c22bc3746155637f7e3d59612aa6caf12496e13ba0bb2f1a087e9611b570a34abea45721323b02ac3a42d3"

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
