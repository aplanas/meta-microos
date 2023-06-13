SUMMARY = "The Blitz html docs"
DESCRIPTION = "Blitz++ is a C++ class library for scientific computing which provides \
performance on par with Fortran 77/90. It uses template techniques to achieve \
high performance. Blitz++ provides dense arrays and vectors, random number \
generators, and small vectors. \
 \
This package provides documentation files for the Blitz Library."
LICENSE = "LGPL-3.0-or-later | BSD-3-Clause | Artistic-2.0"

PV = "1.0.2"

RPM_NAME = "blitz-doc-1.0.2-2.11.noarch.rpm"
RPM_HASH = "b4b35ebba54154ca883408138010f32276c3c1d41b7d960c12df939de52e885d7800ef66961ee4ce6b76152520d8042626f4a57e2f8d3d5a03c18d2a66cc5977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blitz-doc"

RDEPENDS:${PN} += ""

inherit rpm
