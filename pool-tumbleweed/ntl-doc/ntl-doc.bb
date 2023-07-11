SUMMARY = "Documentation for NTL, a number theory library"
DESCRIPTION = "NTL is a C++ library providing data structures and algorithms for \
manipulating signed, arbitrary length integers, and for vectors, \
matrices, and polynomials over the integers and over finite fields. \
 \
This package contains the documentation for the NTL API."
LICENSE = "LGPL-2.1-or-later"

PV = "11.5.1"

RPM_NAME = "ntl-doc-11.5.1-1.9.noarch.rpm"
RPM_HASH = "32c48ea238c682fff07fe2bfeed7d57a3a4a43dcd60fc9a51ee86845c4667774f6b732313dfa897e967863bfffc6a27e538023771aad2ddfa421b48d76df2796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ntl-doc"

RDEPENDS:${PN} += ""

inherit rpm
