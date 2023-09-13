SUMMARY = "A library for nonlinear optimization"
DESCRIPTION = "NLopt is a free/open-source library for nonlinear optimization, \
providing a common interface for a number of different free \
optimization routines available online as well as original \
implementations of various other algorithms."
LICENSE = "LGPL-2.0-only"

PV = "2.7.1"

RPM_NAME = "python311-nlopt-2.7.1-3.16.aarch64.rpm"
RPM_HASH = "483d5c554002756f7564b73ceda334fcf02f37951affcf27963cb90240de11d3b644ab0f84500758174e1a930600905e9691a9ec964d20579b2d5678f36759ad"

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
