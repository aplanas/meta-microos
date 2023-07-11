SUMMARY = "Python interface to the Gravitational-Wave Open Data Center archive"
DESCRIPTION = "The gwosc package provides an interface to querying the open data \
releases hosted on https://gw-openscience.org from the GEO, LIGO, and \
Virgo gravitational-wave observatories."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python39-gwosc-0.7.1-1.3.noarch.rpm"
RPM_HASH = "3d4245f39be206763a5e7b20476e95301174106f856e97efba388aedebb7947c1da748d540dc5f76b657eff2908f0fdf8886c213622c0f24dd16cfad1df51317"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gwosc \
python39-gwosc \
python3dist-gwosc"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
