SUMMARY = "Development files for muParserX"
DESCRIPTION = "The muparserx development files. A C++ Library for Parsing Expressions with \
Strings, Complex Numbers, Vectors, Matrices and more."
LICENSE = "BSD-2-Clause"

PV = "4.0.12"

RPM_NAME = "muparserx-devel-4.0.12-1.4.aarch64.rpm"
RPM_HASH = "6e18b9bf5f50ff48516575358d7367dc51ae555a5e96591a16a579e632ad8336b1d764bb10764226f0d2468ae208b9e467576656307a8ab10092fb939f34e2ea"

RPROVIDES:${PN} += "cmake-muparserx \
muparserx-devel \
pkgconfig-muparserx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmuparserx4-0-12"

inherit rpm
