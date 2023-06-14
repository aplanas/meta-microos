SUMMARY = "Data Analysis, Simulations and Visualization on the Sphere"
DESCRIPTION = "HEALPix is a Hierarchical, Equal Area, and iso-Latitude Pixelation of the \
sphere designed to support efficiently (1) local operations on the pixel set, \
(2) a hierarchical tree structure for multi-resolution applications, and (3) \
the global Fast Spherical Harmonic transform."
LICENSE = "GPL-2.0-or-later"

PV = "3.81"

RPM_NAME = "healpix-3.81-1.7.aarch64.rpm"
RPM_HASH = "d095e48eea2a534292cc96549da3514127d51ea6eb3e9f31d55e395c1a866baf4fb575bd694e1e1c5b35d447ef907d202b137b80a67dd5edf0bc08879f7f9584"

RPROVIDES:${PN} += "healpix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libhealpix-cxx.so.3 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
