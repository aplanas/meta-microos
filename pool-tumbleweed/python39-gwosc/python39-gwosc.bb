SUMMARY = "Python interface to the Gravitational-Wave Open Data Center archive"
DESCRIPTION = "The gwosc package provides an interface to querying the open data \
releases hosted on https://gw-openscience.org from the GEO, LIGO, and \
Virgo gravitational-wave observatories."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python39-gwosc-0.7.1-1.1.noarch.rpm"
RPM_HASH = "7e8dab2c38a66ad66cc674fa0585e79b75fc1b9c3d6fe384499fdd58e2c72d4bf2240ba491ad84159cbd46e5f1929357836a3061bc9a8291ce774c1795b20880"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(gwosc) \
python39-gwosc \
python3dist(gwosc)"
RDEPENDS:${PN} += "python(abi) \
python39-requests"

inherit rpm
