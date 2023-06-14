SUMMARY = "A library for generating maximally-localized Wannier functions"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi3-3.1.0-2.3.aarch64.rpm"
RPM_HASH = "fc13e69947410b816ff7c2897a229aa7c273cbc8a99659cde4bb823405896421e4c6e71ed6a83ee89295e2f765484dafd005001165f93fd5d447cdc20bbd39a2"

RPROVIDES:${PN} += "wannier90-openmpi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libblas.so.3 \
libc.so.6 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.40"

inherit rpm
