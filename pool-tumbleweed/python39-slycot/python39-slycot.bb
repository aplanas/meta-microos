SUMMARY = "A wrapper for the SLICOT control and systems library"
DESCRIPTION = "Slycot is a wrapper for the SLICOT control and systems library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.5.4"

RPM_NAME = "python39-slycot-0.5.4-1.1.aarch64.rpm"
RPM_HASH = "3fc9c31841cf48285275f7bc390e8310cde19d9a7535c03fc5b0e35976b1f4fb36b4a5a376e4a96c181d7781e7b868b475ee173fd121e4ab4555b5371f30b817"

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
