SUMMARY = "Library to manipulate Gravitational Wave Detector data in frame format"
DESCRIPTION = "A Common Data Frame Format for Interferometric Gravitational Wave Detector has \
been developed by VIRGO and LIGO. The Frame Library is a software in C \
language, with interfaces to python and matlab, dedicated to frame data \
manipulation including file input/output."
LICENSE = "LGPL-2.1-or-later"

PV = "8.42.3"

RPM_NAME = "python39-framel-8.42.3-1.6.aarch64.rpm"
RPM_HASH = "ff04e2ad26c1a0ee00cc0163e6918b2cde3f77bf915ced9f1cab624a886ebe8430622097972ed262a3211107b6bf21cca4f774f4734f80940a9f9c8c77b71ce6"

RPROVIDES:${PN} += "python3.9dist-framel \
python39-framel \
python3dist-framel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libframel.so.8 \
libpython3.9.so.1.0 \
python-abi"

inherit rpm
