SUMMARY = "Python interface to the Gravitational-Wave Open Data Center archive"
DESCRIPTION = "The gwosc package provides an interface to querying the open data \
releases hosted on https://gw-openscience.org from the GEO, LIGO, and \
Virgo gravitational-wave observatories."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python310-gwosc-0.7.1-1.3.noarch.rpm"
RPM_HASH = "60977c457584ff01b85a49edfaf7b208073d638e3c24c93ad6930a35bf6ca42ac57dbc134260e497a85e7ad7508f3d48e8b4806e90b0a0cf98479a4e1712896b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gwosc \
python310-gwosc \
python3dist-gwosc"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
