SUMMARY = "Library to manipulate Gravitational Wave Detector data in frame format"
DESCRIPTION = "A Common Data Frame Format for Interferometric Gravitational Wave Detector has \
been developed by VIRGO and LIGO. The Frame Library is a software in C \
language, with interfaces to python and matlab, dedicated to frame data \
manipulation including file input/output."
LICENSE = "LGPL-2.1-or-later"

PV = "8.42.3"

RPM_NAME = "python39-framel-8.42.3-1.5.aarch64.rpm"
RPM_HASH = "1366b7c6f945a80cafe8cf6c1f6dc0ca7c73926ffa4a659a9745c244678cedf2c865ee968869d2debc1740625b1d8821a85b8048a369f21f383f25f27f1e9615"

RPROVIDES:${PN} += "python3.9dist-framel \
python39-framel \
python3dist-framel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libframel.so.8 \
libpython3.9.so.1.0 \
python-abi"

inherit rpm
