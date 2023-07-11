SUMMARY = "A library for nonlinear optimization"
DESCRIPTION = "NLopt is a free/open-source library for nonlinear optimization, \
providing a common interface for a number of different free \
optimization routines available online as well as original \
implementations of various other algorithms."
LICENSE = "LGPL-2.0-only"

PV = "2.7.1"

RPM_NAME = "python39-nlopt-2.7.1-3.15.aarch64.rpm"
RPM_HASH = "4751b00f75779afcde6a273b2e86b0148453e76009312479ae5eed91a9bb6dcc0316d064e814f7a0b927cd4d589b220c2d2f618f7d4a82c3a67480b34274151a"

RPROVIDES:${PN} += "python39-nlopt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnlopt.so.0 \
libstdc++.so.6 \
python-abi \
python39-numpy"

inherit rpm
