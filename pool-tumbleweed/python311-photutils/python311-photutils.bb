SUMMARY = "An Astropy package for photometry"
DESCRIPTION = "Photutils is an affiliated package of Astropy to provide tools for detecting \
and performing photometry of astronomical sources."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "python311-photutils-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "bbb83b6284b778f51df9dbc4ed5fecfd01100d7d8d8fe26374a227038ab6199a8852aee2f87aa688d9ef8a1689db2231a508e1aff65a616c2da06c6ab5f00de2"

RPROVIDES:${PN} += "python3.11dist(photutils) \
python311-photutils \
python311-photutils(aarch-64) \
python3dist(photutils)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python311-astropy \
python311-numpy"

inherit rpm
