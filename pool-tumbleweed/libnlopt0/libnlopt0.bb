SUMMARY = "A library for nonlinear optimization"
DESCRIPTION = "NLopt is a free/open-source library for nonlinear optimization, \
providing a common interface for a number of different free \
optimization routines available online as well as original \
implementations of various other algorithms."
LICENSE = "LGPL-2.0-only"

PV = "2.7.1"

RPM_NAME = "libnlopt0-2.7.1-3.8.aarch64.rpm"
RPM_HASH = "6d2e143c4ee7a75a8f4448b42c82a962c2a925aa9d8199e626b3a12d2cba682cde096944a9f527a5c4b1f63e7b66fc2bfe5cae7c98ae45660b7e06146b17309e"

RPROVIDES:${PN} += "libnlopt.so.0 \
libnlopt0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
