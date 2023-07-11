SUMMARY = "A wrapper for the SLICOT control and systems library"
DESCRIPTION = "Slycot is a wrapper for the SLICOT control and systems library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.5.4"

RPM_NAME = "python39-slycot-0.5.4-1.2.aarch64.rpm"
RPM_HASH = "d4d37412a684f61480a2bdc53d228b587a9c314355e752245c3ea3099f3666b79194978c57d344d689984d1cfe9d95b18a99d1f6d6d97bf5689a313c41f4e9e3"

RPROVIDES:${PN} += "python3.9dist-slycot \
python39-slycot \
python3dist-slycot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
python-abi \
python39-numpy"

inherit rpm
