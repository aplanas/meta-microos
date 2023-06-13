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

RPM_NAME = "libLHAPDF-6_5_4-6.5.4-1.1.aarch64.rpm"
RPM_HASH = "c8716c97281c308dcc6bee9e1742a60e3264a869c8d6d997e93aed5e444880a60526aa4d87be5009bc7cce2a0617e125e38009604dfe23a6805f4c0264032080"

RPROVIDES:${PN} += "libLHAPDF \
libLHAPDF-6.5.4.so()(64bit) \
libLHAPDF-6_5_4 \
libLHAPDF-6_5_4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
