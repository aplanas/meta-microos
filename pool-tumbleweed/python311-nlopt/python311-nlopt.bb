SUMMARY = "A library for nonlinear optimization"
DESCRIPTION = "NLopt is a free/open-source library for nonlinear optimization, \
providing a common interface for a number of different free \
optimization routines available online as well as original \
implementations of various other algorithms."
LICENSE = "LGPL-2.0-only"

PV = "2.7.1"

RPM_NAME = "python311-nlopt-2.7.1-3.15.aarch64.rpm"
RPM_HASH = "0323970c75256f79b3014fad9d256f30c0fea732022921ea197abe09af2e018a01fd4660d8546cd06589ac7ae2fbdca921a244f0f8bbdc644c6cfe70f198388a"

RPROVIDES:${PN} += "python3-nlopt \
python311-nlopt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnlopt.so.0 \
libstdc++.so.6 \
python-abi \
python311-numpy"

inherit rpm
