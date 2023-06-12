SUMMARY = "MPFR multiple-precision floating-point computation shared library"
DESCRIPTION = "The MPFR library is a C library for multiple-precision floating-point \
computations with exact rounding (also called correct rounding). It is \
based on the GMP multiple-precision library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.2"

RPM_NAME = "mingw32-libmpfr4-3.1.2-2.12.noarch.rpm"
RPM_HASH = "8cc47e1f6e4c2f86cfadf749fde902af8d0d5508b890c5245b5184cb798df9c1c72003db7c99381a76972e2862bc7131d630d6230560f56a601f8d8bbfcfbf73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32(libmpfr-4.dll) \
mingw32-libmpfr \
mingw32-libmpfr4"
RDEPENDS:${PN} += "mingw32(libgcc_s_sjlj-1.dll) \
mingw32(libgmp-10.dll)"

inherit rpm
