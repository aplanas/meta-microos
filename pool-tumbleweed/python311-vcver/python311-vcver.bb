SUMMARY = "Provide package versions with version control data"
DESCRIPTION = "Python module to provide package versions with version control data."
LICENSE = "MIT"

PV = "0.2.12"

RPM_NAME = "python311-vcver-0.2.12-1.5.noarch.rpm"
RPM_HASH = "7ac47c6eb9e00cbc2579ccfa3095ddc1139d284edb038e2a4423977d5523902b73fbba135c38f55f88d80eabd441cfd3074aea9e423d67c3c2984697e6cf5d3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vcver \
python3.11dist-vcver \
python311-vcver \
python3dist-vcver"

RDEPENDS:${PN} += "python-abi \
python311-packaging"

inherit rpm
