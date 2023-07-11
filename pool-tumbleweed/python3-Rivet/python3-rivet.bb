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

PV = "3.1.7"

RPM_NAME = "python3-Rivet-3.1.7-1.2.aarch64.rpm"
RPM_HASH = "a24f5170b9b619b9fdcf1705eef9fec4767ac168022814d3a1330dd1fe8c7ebfe0471d5ed58bc66a7eff6e5c86dced25de269b6ccc98d8ec295ce88195cef548"

RPROVIDES:${PN} += "python-Rivet \
python3-Rivet"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
Rivet-data \
ld-linux-aarch64.so.1 \
libHepMC3.so.3 \
libRivet-3.1.7.so \
libc.so.6 \
libgcc-s.so.1 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
libz.so.1 \
python-abi"

inherit rpm
