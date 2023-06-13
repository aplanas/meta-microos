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

RPM_NAME = "healpix_cxx-devel-3.81-1.7.aarch64.rpm"
RPM_HASH = "659805b9a95155557b1132fde8558825aa600c933d9f721072b7991f67b400c61c0fffc0782a932a1a98ded4885a1da8ac665781c671ec4b5bb9cb045a4c0d53"

RPROVIDES:${PN} += "healpix_cxx-devel \
healpix_cxx-devel(aarch-64) \
pkgconfig(healpix_cxx)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhealpix_cxx3 \
pkgconfig(cfitsio) \
pkgconfig(libsharp) \
pkgconfig(zlib)"

inherit rpm
