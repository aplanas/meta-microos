SUMMARY = "An Astropy package for photometry"
DESCRIPTION = "Photutils is an affiliated package of Astropy to provide tools for detecting \
and performing photometry of astronomical sources."
LICENSE = "BSD-3-Clause"

PV = "1.9.0"

RPM_NAME = "python310-photutils-1.9.0-1.1.aarch64.rpm"
RPM_HASH = "dc4718b3d8dd505c8733c0f58080e7d5ac8cc1c14369cac35863f846465f662d2b6217b5bb0a474f2227cc4120765604ba5e4d1de5a8461a85997b63205da95b"

RPROVIDES:${PN} += "python3.10dist-photutils \
python310-photutils \
python3dist-photutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-astropy \
python310-numpy"

inherit rpm
