SUMMARY = "A python CDF reader toolkit"
DESCRIPTION = "A python module to read/write CDF (Common Data Format .cdf) files without needing to install the CDF NASA library."
LICENSE = "MIT"

PV = "0.3.20"

RPM_NAME = "python310-cdflib-0.3.20-1.8.noarch.rpm"
RPM_HASH = "06c80ae578620f03f326851d43e7259983c9628f77c6a8628d5687d12ef6969baf7048161ae2b91b7903ccd4da3c2d3b71d61ec7ef6b402031f27de9d0bb8418"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cdflib \
python310-cdflib \
python3dist-cdflib"

RDEPENDS:${PN} += "python-abi \
python310-attrs \
python310-numpy"

inherit rpm
