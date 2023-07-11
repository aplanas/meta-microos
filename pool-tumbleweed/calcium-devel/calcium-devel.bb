SUMMARY = "Development files for Calcium, an exact number computation library"
DESCRIPTION = "A C library for exact computation with real and complex numbers. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of Calcium."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.1"

RPM_NAME = "calcium-devel-0.4.1-1.10.aarch64.rpm"
RPM_HASH = "9c19cd6a7d61a209728920d1caa70b805a39b685f75fd2135ba1fbc398c0db7111fd74b7fa4a9053a4d43a4439bf4bcde50a36cf479ae3a000ab943566a33388"

RPROVIDES:${PN} += "calcium-devel"

RDEPENDS:${PN} += "libcalcium0"

inherit rpm
