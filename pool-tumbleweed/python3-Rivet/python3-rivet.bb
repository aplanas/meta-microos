SUMMARY = "A toolkit for validation of Monte Carlo event generators"
DESCRIPTION = "The Rivet project (Robust Independent Validation of Experiment and \
Theory) is a toolkit for validation of Monte Carlo event generators. \
It provides a large (and ever growing) set of experimental analyses \
useful for MC generator development, validation, and tuning, as well \
as a convenient infrastructure for adding your own analyses. Rivet is \
the most widespread way by which analysis code from the LHC and other \
high-energy collider experiments is preserved for comparison to and \
development of future theory models. \
 \
This package provides the python bindings for Rivet."
LICENSE = "GPL-2.0-only"

PV = "3.1.8"

RPM_NAME = "python3-Rivet-3.1.8-1.2.aarch64.rpm"
RPM_HASH = "4d4d1a157feaf923b777b9c55407c92ffd39195a9af6c647788af9d4feb726f8aa733bb6ea95246752d37b596f1307afc2d444cf4d6ac3ab5d4e59c3d811f241"

RPROVIDES:${PN} += "python-Rivet \
python3-Rivet"

RDEPENDS:${PN} += "/usr/bin/python3 \
Rivet-data \
ld-linux-aarch64.so.1 \
libHepMC3.so.3 \
libRivet-3.1.8.so \
libc.so.6 \
libgcc-s.so.1 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
