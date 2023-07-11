SUMMARY = "Bindings for the Boost Geometry library"
DESCRIPTION = "Bindings for the Boost Geometry library"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.15"

RPM_NAME = "perl-Boost-Geometry-Utils-0.15-4.38.aarch64.rpm"
RPM_HASH = "e47d69ba4a9bf5ff3181f9c07b18e411181eb08376e14df5e76613d50bb048b9a118dc38a906329f2dd5058a035a595f61e48b99c187148cb0ce709071cbd706"

RPROVIDES:${PN} += "perl-Boost--Geometry--Utils \
perl-Boost-Geometry-Utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
