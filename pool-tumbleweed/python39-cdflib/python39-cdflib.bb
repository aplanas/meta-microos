SUMMARY = "A python CDF reader toolkit"
DESCRIPTION = "A python module to read/write CDF (Common Data Format .cdf) files without needing to install the CDF NASA library."
LICENSE = "MIT"

PV = "0.3.20"

RPM_NAME = "python39-cdflib-0.3.20-1.6.noarch.rpm"
RPM_HASH = "77c8a7ea3d33c02a88556c7ae17bd65dbeb8ca8f1626e471b0df886a70fd4be853722bce3f030df10f5314f0d700c5406ec0721b9602c5b6577adc76bc503b7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cdflib \
python39-cdflib \
python3dist-cdflib"

RDEPENDS:${PN} += "python-abi \
python39-attrs \
python39-numpy"

inherit rpm
