SUMMARY = "An Astropy package for photometry"
DESCRIPTION = "Photutils is an affiliated package of Astropy to provide tools for detecting \
and performing photometry of astronomical sources."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "python39-photutils-1.8.0-1.3.aarch64.rpm"
RPM_HASH = "9c237d888c8839e208d680a005fe8ad8797d0ab739aed8c1f66ba5711c6218afbe2e4f2c1ee46a98ddd8080ae200024b3d6a8ae00109b0d1196dbb0855f8b879"

RPROVIDES:${PN} += "python3.9dist-photutils \
python39-photutils \
python3dist-photutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-astropy \
python39-numpy"

inherit rpm
