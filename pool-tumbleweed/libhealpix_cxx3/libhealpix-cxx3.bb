SUMMARY = "Shared library for healpix - C++ bindings"
DESCRIPTION = "HEALPix is a Hierarchical, Equal Area, and iso-Latitude Pixelation of the \
sphere designed to support efficiently (1) local operations on the pixel set, \
(2) a hierarchical tree structure for multi-resolution applications, and (3) \
the global Fast Spherical Harmonic transform. \
 \
This package provides the shared library for the C++ bindings of healpix."
LICENSE = "GPL-2.0-or-later"

PV = "3.81"

RPM_NAME = "libhealpix_cxx3-3.81-1.7.aarch64.rpm"
RPM_HASH = "c2801d72adc0c40728eabedae289131df8750e6396dcbd2648b013254fa26a93e59234189774bb90e187d3bc2dfb037f8b909ddd05b5a6313009e8245e7bb8c3"

RPROVIDES:${PN} += "libhealpix-cxx.so.3 \
libhealpix-cxx3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libsharp.so.0 \
libstdc++.so.6"

inherit rpm
