SUMMARY = "A library for generating maximally-localized Wannier functions"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi1-3.1.0-2.4.aarch64.rpm"
RPM_HASH = "a8d8bdc033eaca7bb7b775e176f92b0760dc555b6e986c647780c6621c8e9977ad2290649f5d4e48ee60da96c3dd2500df878c334afa52cda73b1dd13e60caa5"

RPROVIDES:${PN} += "wannier90-openmpi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libblas.so.3 \
libc.so.6 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.12"

inherit rpm
