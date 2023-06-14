SUMMARY = "Development files for libntl"
DESCRIPTION = "NTL is a C++ library providing data structures and algorithms for \
manipulating signed, arbitrary length integers, and for vectors, \
matrices, and polynomials over the integers and over finite fields. \
 \
This package contains the headers and library links to libntl."
LICENSE = "LGPL-2.1-or-later"

PV = "11.5.1"

RPM_NAME = "ntl-devel-11.5.1-1.8.aarch64.rpm"
RPM_HASH = "663761d32f73e4f4fa763d80caf7a7c784e3072cfd8b9763db6368abe2541e4351ed07b4284818ceff40481d347d6110a79fe8734081e46ecaaf90f319c1cca5"

RPROVIDES:${PN} += "ntl-devel"

RDEPENDS:${PN} += "libntl44"

inherit rpm
