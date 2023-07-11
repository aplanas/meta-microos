SUMMARY = "The Blitz html docs"
DESCRIPTION = "Blitz++ is a C++ class library for scientific computing which provides \
performance on par with Fortran 77/90. It uses template techniques to achieve \
high performance. Blitz++ provides dense arrays and vectors, random number \
generators, and small vectors. \
 \
This package provides documentation files for the Blitz Library."
LICENSE = "LGPL-3.0-or-later | BSD-3-Clause | Artistic-2.0"

PV = "1.0.2"

RPM_NAME = "blitz-doc-1.0.2-2.12.noarch.rpm"
RPM_HASH = "2e0c9a8ab3b352e3ad51ed1c0b1ce319df16e6c74dd1c91ec9b91649971dacf570960f6bc9878f41fe27b8e0705126772f9279e2f3077af2f5fa204d3d73c2c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blitz-doc"

RDEPENDS:${PN} += ""

inherit rpm
