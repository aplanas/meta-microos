SUMMARY = "A python CDF reader toolkit"
DESCRIPTION = "A python module to read/write CDF (Common Data Format .cdf) files without needing to install the CDF NASA library."
LICENSE = "MIT"

PV = "0.3.20"

RPM_NAME = "python311-cdflib-0.3.20-1.8.noarch.rpm"
RPM_HASH = "9b63b63ec25d1cd0b7fbd098a821d5418f30b53503de382f47de40879c97f03608e679fd962eafffdbf5df5f09bc8ce7eb9ab82eba01bb389dc66161ac3d0b2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cdflib \
python3.11dist-cdflib \
python311-cdflib \
python3dist-cdflib"

RDEPENDS:${PN} += "python-abi \
python311-attrs \
python311-numpy"

inherit rpm
