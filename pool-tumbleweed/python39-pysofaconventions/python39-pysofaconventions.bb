SUMMARY = "Python implementation of the SOFA Convention"
DESCRIPTION = "pysofaconventions is a python implementation of the SOFA Specification."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "python39-pysofaconventions-0.1.5-2.7.noarch.rpm"
RPM_HASH = "c986509ead941494b9dd48f7fd14317f673410c39a126b72a1c52b417b9d47a2a8d6a129171c395469d7222ab1ee27a21db6aa808c6a8afd293c0a146b1a5712"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pysofaconventions) \
python39-pysofaconventions \
python3dist(pysofaconventions)"

RDEPENDS:${PN} += "python(abi) \
python39-netCDF4"

inherit rpm
