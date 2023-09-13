SUMMARY = "A library for nonlinear optimization"
DESCRIPTION = "NLopt is a free/open-source library for nonlinear optimization, \
providing a common interface for a number of different free \
optimization routines available online as well as original \
implementations of various other algorithms."
LICENSE = "LGPL-2.0-only"

PV = "2.7.1"

RPM_NAME = "python39-nlopt-2.7.1-3.16.aarch64.rpm"
RPM_HASH = "afd810bb6aee05308142c923b47840612ce9b7ec97746919bba17f87a96d2ad8b0f20a9a07f29cfb1da4fc9186ee0b4c3082e94c0eeac26ff6fd8b6d5cc36249"

RPROVIDES:${PN} += "python39-nlopt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnlopt.so.0 \
libstdc++.so.6 \
python-abi \
python39-numpy"

inherit rpm
