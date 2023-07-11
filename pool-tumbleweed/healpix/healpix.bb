SUMMARY = "Data Analysis, Simulations and Visualization on the Sphere"
DESCRIPTION = "HEALPix is a Hierarchical, Equal Area, and iso-Latitude Pixelation of the \
sphere designed to support efficiently (1) local operations on the pixel set, \
(2) a hierarchical tree structure for multi-resolution applications, and (3) \
the global Fast Spherical Harmonic transform."
LICENSE = "GPL-2.0-or-later"

PV = "3.81"

RPM_NAME = "healpix-3.81-1.8.aarch64.rpm"
RPM_HASH = "5b7f8d6f5f7f72cdcaf265eee57536c94d37bdb7919b1385b16b675f8ab3d62d0ab6311158dfbd111286ec5058408243016b7c29b2815bd72913250e5df51934"

RPROVIDES:${PN} += "healpix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libhealpix-cxx.so.3 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
