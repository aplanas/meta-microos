SUMMARY = "A library for nonlinear optimization"
DESCRIPTION = "NLopt is a free/open-source library for nonlinear optimization, \
providing a common interface for a number of different free \
optimization routines available online as well as original \
implementations of various other algorithms."
LICENSE = "LGPL-2.0-only"

PV = "2.7.1"

RPM_NAME = "python310-nlopt-2.7.1-3.15.aarch64.rpm"
RPM_HASH = "662e1b5914619d6c28b0aacce719d352e0bf2e64bdb275a031fd3c3db80161d6774b8a44b08064fb5c279bbef36af200b405045f06475bf1eda117f03058f75b"

RPROVIDES:${PN} += "python310-nlopt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnlopt.so.0 \
libstdc++.so.6 \
python-abi \
python310-numpy"

inherit rpm
