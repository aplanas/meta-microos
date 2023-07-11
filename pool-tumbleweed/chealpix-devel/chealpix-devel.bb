SUMMARY = "Headers and devel files for healpix - C bindings"
DESCRIPTION = "HEALPix is a Hierarchical, Equal Area, and iso-Latitude Pixelation of the \
sphere designed to support efficiently (1) local operations on the pixel set, \
(2) a hierarchical tree structure for multi-resolution applications, and (3) \
the global Fast Spherical Harmonic transform. \
 \
This package provides the headers and devel files for building apps with \
healpix in the C language."
LICENSE = "GPL-2.0-or-later"

PV = "3.81"

RPM_NAME = "chealpix-devel-3.81-1.8.aarch64.rpm"
RPM_HASH = "9059e4d285295a229511cfdb3a563271deb1760b4a8fb69bfdec5191d47e3f2c029b502c7fc52f2168215e9b081e61821e6511650caf83ee7e177a0ab8ac102d"

RPROVIDES:${PN} += "chealpix-devel \
pkgconfig-chealpix"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libchealpix0 \
pkgconfig-cfitsio \
pkgconfig-libsharp"

inherit rpm
