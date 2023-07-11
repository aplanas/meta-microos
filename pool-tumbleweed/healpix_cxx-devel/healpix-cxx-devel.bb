SUMMARY = "Headers and devel files for healpix - C++ bindings"
DESCRIPTION = "HEALPix is a Hierarchical, Equal Area, and iso-Latitude Pixelation of the \
sphere designed to support efficiently (1) local operations on the pixel set, \
(2) a hierarchical tree structure for multi-resolution applications, and (3) \
the global Fast Spherical Harmonic transform. \
 \
This package provides the headers and devel files for building apps with \
healpix in the C++ language."
LICENSE = "GPL-2.0-or-later"

PV = "3.81"

RPM_NAME = "healpix_cxx-devel-3.81-1.8.aarch64.rpm"
RPM_HASH = "4444d4e07ebbd7f4dfa5a577d1d67258274f0d2e292d68e33f9524f0a907d062e0b1909f98d0bd8e562d7e4a42bb152c1d32398b9f0733b3bf1818fd5dd02589"

RPROVIDES:${PN} += "healpix-cxx-devel \
pkgconfig-healpix-cxx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhealpix-cxx3 \
pkgconfig-cfitsio \
pkgconfig-libsharp \
pkgconfig-zlib"

inherit rpm
