SUMMARY = "A python CDF reader toolkit"
DESCRIPTION = "A python module to read/write CDF (Common Data Format .cdf) files without needing to install the CDF NASA library."
LICENSE = "MIT"

PV = "0.3.20"

RPM_NAME = "python310-cdflib-0.3.20-1.6.noarch.rpm"
RPM_HASH = "3037b8b32c0d39b9dd4e1d21f9d8c1d1f627588b59747712a9c3032a6d01ced8f4528d8dc9c779157de3835419ac758525670b08cb75b9f1108db964eb93ae01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cdflib \
python3.10dist(cdflib) \
python310-cdflib \
python3dist(cdflib)"

RDEPENDS:${PN} += "python(abi) \
python310-attrs \
python310-numpy"

inherit rpm
