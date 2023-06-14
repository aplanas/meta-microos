SUMMARY = "An Astropy package for photometry"
DESCRIPTION = "Photutils is an affiliated package of Astropy to provide tools for detecting \
and performing photometry of astronomical sources."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "python39-photutils-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "6734cb3e75e5c45b6acf694737708eb27376806ebba4e5556cc6b88322a3963b0b4671047404e37a75a07b9a297234f48d889b30e7bb95d7d5008de724c6b123"

RPROVIDES:${PN} += "python3.9dist-photutils \
python39-photutils \
python3dist-photutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-astropy \
python39-numpy"

inherit rpm
