SUMMARY = "Shared library for healpix - C bindings"
DESCRIPTION = "HEALPix is a Hierarchical, Equal Area, and iso-Latitude Pixelation of the \
sphere designed to support efficiently (1) local operations on the pixel set, \
(2) a hierarchical tree structure for multi-resolution applications, and (3) \
the global Fast Spherical Harmonic transform. \
 \
This package provides the shared library for the C bindings of healpix."
LICENSE = "GPL-2.0-or-later"

PV = "3.81"

RPM_NAME = "libchealpix0-3.81-1.7.aarch64.rpm"
RPM_HASH = "1480f0fd5627e685e08178a5de17994582f9b3612b543a96a2509de7a690300b3d3fd2de242f856ced5317a91b2ca7ef8291b817d9c5369761f4e5736a1719c6"

RPROVIDES:${PN} += "libchealpix.so.0 \
libchealpix0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libm.so.6"

inherit rpm
