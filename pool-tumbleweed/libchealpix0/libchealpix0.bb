SUMMARY = "Shared library for healpix - C bindings"
DESCRIPTION = "HEALPix is a Hierarchical, Equal Area, and iso-Latitude Pixelation of the \
sphere designed to support efficiently (1) local operations on the pixel set, \
(2) a hierarchical tree structure for multi-resolution applications, and (3) \
the global Fast Spherical Harmonic transform. \
 \
This package provides the shared library for the C bindings of healpix."
LICENSE = "GPL-2.0-or-later"

PV = "3.81"

RPM_NAME = "libchealpix0-3.81-1.8.aarch64.rpm"
RPM_HASH = "f2f73786afb1038482de0e882a81c67ad92384900592f2062106146c69d08a9c7596c5a99f7edd899e25d0f3e0c2eec88d686f948f042679b51bd2defc46e0bd"

RPROVIDES:${PN} += "libchealpix.so.0 \
libchealpix0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libm.so.6"

inherit rpm
