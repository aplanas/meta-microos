SUMMARY = "Development files for libntl"
DESCRIPTION = "NTL is a C++ library providing data structures and algorithms for \
manipulating signed, arbitrary length integers, and for vectors, \
matrices, and polynomials over the integers and over finite fields. \
 \
This package contains the headers and library links to libntl."
LICENSE = "LGPL-2.1-or-later"

PV = "11.5.1"

RPM_NAME = "ntl-devel-11.5.1-1.9.aarch64.rpm"
RPM_HASH = "1c5cf3ec39167a86b0007b1afa248e39cf829279fb9ba967069c9e6e4093e6867fdd5c7c0f656629500c962d94e1e0d5d7a1db4564bbfa8281f78ce9188e2f0e"

RPROVIDES:${PN} += "ntl-devel"

RDEPENDS:${PN} += "libntl44"

inherit rpm
