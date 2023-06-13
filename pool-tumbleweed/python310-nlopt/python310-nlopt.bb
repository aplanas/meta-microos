SUMMARY = "A library for nonlinear optimization"
DESCRIPTION = "NLopt is a free/open-source library for nonlinear optimization, \
providing a common interface for a number of different free \
optimization routines available online as well as original \
implementations of various other algorithms."
LICENSE = "LGPL-2.0-only"

PV = "2.7.1"

RPM_NAME = "python310-nlopt-2.7.1-3.14.aarch64.rpm"
RPM_HASH = "a9a053f2493353400023f35b218efb857b786248261c79e9e3dd21923f096ba3fde8e6afd2eee9fa6b6b936e07e8a7b11438e0628aca5b3568f8877b14b7f353"

RPROVIDES:${PN} += "python3-nlopt \
python310-nlopt \
python310-nlopt(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libnlopt.so.0()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python310-numpy"

inherit rpm
