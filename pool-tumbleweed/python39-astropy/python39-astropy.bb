SUMMARY = "Community-developed python astronomy tools"
DESCRIPTION = "Astropy is a package intended to contain core functionality and some \
common tools needed for performing astronomy and astrophysics research with \
Python. It also provides an index for other astronomy packages and tools for \
managing them."
LICENSE = "BSD-3-Clause"

PV = "5.3.1"

RPM_NAME = "python39-astropy-5.3.1-1.1.aarch64.rpm"
RPM_HASH = "d3df37ad7c40307ebf43ab43ae7a73562b0dfb0650053a2ebfaf27005c04d0e06f3b569291c003475c9612490520630e79c9488259ccfe4f6524051fc6629da9"

RPROVIDES:${PN} += "python3.9dist-astropy \
python39-astropy \
python3dist-astropy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libm.so.6 \
libwcs.so.7 \
python-abi \
python39-PyYAML \
python39-dbm \
python39-numpy \
python39-packaging \
python39-pyerfa \
update-alternatives"

inherit rpm
