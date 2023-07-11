SUMMARY = "Library to manipulate Gravitational Wave Detector data in frame format"
DESCRIPTION = "A Common Data Frame Format for Interferometric Gravitational Wave Detector has \
been developed by VIRGO and LIGO. The Frame Library is a software in C \
language, with interfaces to python and matlab, dedicated to frame data \
manipulation including file input/output."
LICENSE = "LGPL-2.1-or-later"

PV = "8.42.3"

RPM_NAME = "python310-framel-8.42.3-1.6.aarch64.rpm"
RPM_HASH = "c84a3879de3dedb273e3a040c2d3a7eb649c1a6dbe7d67aa5dac216f91008ce13f1e0bdeb65933e9f21e9c76775696b39fb28681ade60e4ec2ecd2e987183416"

RPROVIDES:${PN} += "python3.10dist-framel \
python310-framel \
python3dist-framel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libframel.so.8 \
libpython3.10.so.1.0 \
python-abi"

inherit rpm
