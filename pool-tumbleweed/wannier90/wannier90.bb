SUMMARY = "A library for generating maximally-localized Wannier functions"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-3.1.0-2.4.aarch64.rpm"
RPM_HASH = "04b886747f0a8d9254d28d5fe62c950b8bb6e749639ea726cef1b81ccf0cae1918576d167046c5824ae364a2a9f710086305a1b2bddbcc15d02d4ce65a1847e9"

RPROVIDES:${PN} += "wannier90"

RDEPENDS:${PN} += "/sbin/ldconfig \
libblas.so.3 \
libc.so.6 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6"

inherit rpm
