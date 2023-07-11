SUMMARY = "A library for unified and interface to PDF sets"
DESCRIPTION = "LHAPDF provides a unified and interface to PDF (probability \
distribution function) sets. It also works with the more recent \
multiple 'error' sets, and incorporates many of the older sets found \
in PDFLIB, including pion and photon PDFs. In LHAPDF, the computer \
code and input parameters/grids are separated, thus allowing updating \
and no limit to the expansion possibilities. \
 \
This package provides the shared library for LHAPDF."
LICENSE = "GPL-3.0-only"

PV = "6.5.4"

RPM_NAME = "libLHAPDF-6_5_4-6.5.4-1.2.aarch64.rpm"
RPM_HASH = "e14d3a38545066c350680bdf161909476b96c712c38e90d630e374cd770457ff6df6ffd7495e35a17bd2960b0df7fb3aaeadad59b55eb3afacf11aab5f0cd8e4"

RPROVIDES:${PN} += "libLHAPDF \
libLHAPDF-6-5-4 \
libLHAPDF-6.5.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
