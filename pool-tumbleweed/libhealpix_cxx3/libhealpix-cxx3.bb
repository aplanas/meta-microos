SUMMARY = "Shared library for healpix - C++ bindings"
DESCRIPTION = "HEALPix is a Hierarchical, Equal Area, and iso-Latitude Pixelation of the \
sphere designed to support efficiently (1) local operations on the pixel set, \
(2) a hierarchical tree structure for multi-resolution applications, and (3) \
the global Fast Spherical Harmonic transform. \
 \
This package provides the shared library for the C++ bindings of healpix."
LICENSE = "GPL-2.0-or-later"

PV = "3.81"

RPM_NAME = "libhealpix_cxx3-3.81-1.8.aarch64.rpm"
RPM_HASH = "b502a2c5ff6b56bd935a56f154057aa02b2baca030f8ee1e792693c55dc5088730bd05e662775a99a1b1307ae6334bc5d179bb1915300f52dd53b9a4f8f80a11"

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
