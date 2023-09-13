SUMMARY = "A library for nonlinear optimization"
DESCRIPTION = "NLopt is a free/open-source library for nonlinear optimization, \
providing a common interface for a number of different free \
optimization routines available online as well as original \
implementations of various other algorithms."
LICENSE = "LGPL-2.0-only"

PV = "2.7.1"

RPM_NAME = "python310-nlopt-2.7.1-3.16.aarch64.rpm"
RPM_HASH = "b9a361fa53fe6a3bbec3e4e9f08878054c155ce3f92ec0ceb09e5db9fc8d837aa95671c5ed55b68b1914d5de041f7a1982f48be438eb90936d2bbb507d43c2cc"

RPROVIDES:${PN} += "python310-nlopt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnlopt.so.0 \
libstdc++.so.6 \
python-abi \
python310-numpy"

inherit rpm
