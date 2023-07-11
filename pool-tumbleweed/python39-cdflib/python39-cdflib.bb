SUMMARY = "A python CDF reader toolkit"
DESCRIPTION = "A python module to read/write CDF (Common Data Format .cdf) files without needing to install the CDF NASA library."
LICENSE = "MIT"

PV = "0.3.20"

RPM_NAME = "python39-cdflib-0.3.20-1.8.noarch.rpm"
RPM_HASH = "7d1a9700b6b4cd2db5973d9fca7b58bbe001eda51621fe5c96d1e34e15b908320c8654deca80149d1210a1f618332821e24d90bd14d6d9b34265233880226122"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cdflib \
python39-cdflib \
python3dist-cdflib"

RDEPENDS:${PN} += "python-abi \
python39-attrs \
python39-numpy"

inherit rpm
