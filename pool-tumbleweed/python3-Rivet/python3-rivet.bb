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
LICENSE = "GPL-2.0-only & Apache-2.0 & MPL-2.0 & LPPL-1.3a & BSL-1.0"

PV = "3.1.8"

RPM_NAME = "python3-Rivet-3.1.8-2.1.aarch64.rpm"
RPM_HASH = "557f96d691dfc1e5fea971c6efeb96d3fa961477881dc0b7c9570263b2e37c47c5e0f4154c79e0dfb2961e7228572e68039ba120f856e23c225e58cedfc10a12"

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
