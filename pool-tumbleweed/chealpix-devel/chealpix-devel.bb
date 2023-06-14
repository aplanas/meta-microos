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

RPM_NAME = "chealpix-devel-3.81-1.7.aarch64.rpm"
RPM_HASH = "7e3063b0cc0a7c24e47ca62208186f426cddd312dac28ab3ce0d717598eb3e7feba9130ec3c3af0666cb197e787d7af71f1da1ec01eeb9392b5f0eb20161f5d1"

RPROVIDES:${PN} += "chealpix-devel \
pkgconfig-chealpix"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libchealpix0 \
pkgconfig-cfitsio \
pkgconfig-libsharp"

inherit rpm
