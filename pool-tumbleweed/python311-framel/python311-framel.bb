SUMMARY = "Library to manipulate Gravitational Wave Detector data in frame format"
DESCRIPTION = "A Common Data Frame Format for Interferometric Gravitational Wave Detector has \
been developed by VIRGO and LIGO. The Frame Library is a software in C \
language, with interfaces to python and matlab, dedicated to frame data \
manipulation including file input/output."
LICENSE = "LGPL-2.1-or-later"

PV = "8.42.3"

RPM_NAME = "python311-framel-8.42.3-1.6.aarch64.rpm"
RPM_HASH = "b69a1df52b62f36c6ab335b08eea24e20085a218d61ca6160f319521fda40f0900a6b49c2761129f1ec5c40e9d5f06aacff8ae07f26c92f029f486295d4ca929"

RPROVIDES:${PN} += "python3-framel \
python3.11dist-framel \
python311-framel \
python3dist-framel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libframel.so.8 \
libpython3.11.so.1.0 \
python-abi"

inherit rpm
