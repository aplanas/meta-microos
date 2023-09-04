SUMMARY = "An Astropy package for photometry"
DESCRIPTION = "Photutils is an affiliated package of Astropy to provide tools for detecting \
and performing photometry of astronomical sources."
LICENSE = "BSD-3-Clause"

PV = "1.9.0"

RPM_NAME = "python39-photutils-1.9.0-1.1.aarch64.rpm"
RPM_HASH = "ba29777ab50b1baa9deb3562e8f5a607510c77d1f474a88ee99061c4e084cfd8915fa71fc693fc565616cf63a8e9f4337e422f34f2e5e420fdae96809e8be3c5"

RPROVIDES:${PN} += "python3.9dist-photutils \
python39-photutils \
python3dist-photutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-astropy \
python39-numpy"

inherit rpm
