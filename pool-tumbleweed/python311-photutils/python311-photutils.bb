SUMMARY = "An Astropy package for photometry"
DESCRIPTION = "Photutils is an affiliated package of Astropy to provide tools for detecting \
and performing photometry of astronomical sources."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "python311-photutils-1.8.0-1.3.aarch64.rpm"
RPM_HASH = "f965f884b74f77ec2d97ca31d85e5d177d791bd9712ae0e0a85681bec697ba1232c1147e2e8c1082bb9ad64e8a10e9c85a7d61e35336f307686cd54188747a9f"

RPROVIDES:${PN} += "python3-photutils \
python3.11dist-photutils \
python311-photutils \
python3dist-photutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-astropy \
python311-numpy"

inherit rpm
