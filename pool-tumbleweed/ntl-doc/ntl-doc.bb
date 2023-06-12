SUMMARY = "Documentation for NTL, a number theory library"
DESCRIPTION = "NTL is a C++ library providing data structures and algorithms for \
manipulating signed, arbitrary length integers, and for vectors, \
matrices, and polynomials over the integers and over finite fields. \
 \
This package contains the documentation for the NTL API."
LICENSE = "LGPL-2.1-or-later"

PV = "11.5.1"

RPM_NAME = "ntl-doc-11.5.1-1.8.noarch.rpm"
RPM_HASH = "f856e2d72edf3e972cb430c3d39f76ac30c346101813333b691c2a8d4edc36c2ea294bb7908ae294c7be66576409f19d4595068e6facbd53f7d93aa91748efc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ntl-doc"
RDEPENDS:${PN} += ""

inherit rpm
