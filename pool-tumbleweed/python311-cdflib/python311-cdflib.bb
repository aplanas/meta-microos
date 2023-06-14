SUMMARY = "A python CDF reader toolkit"
DESCRIPTION = "A python module to read/write CDF (Common Data Format .cdf) files without needing to install the CDF NASA library."
LICENSE = "MIT"

PV = "0.3.20"

RPM_NAME = "python311-cdflib-0.3.20-1.6.noarch.rpm"
RPM_HASH = "79505afa114409d096af0faa92571dc353a814497208cb1c5f4d1b5b4ed618ed1fa3e1506b9c1fa0b51b866ea5911b3365689f6d724c838272406efde7ea3122"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-cdflib \
python311-cdflib \
python3dist-cdflib"

RDEPENDS:${PN} += "python-abi \
python311-attrs \
python311-numpy"

inherit rpm
