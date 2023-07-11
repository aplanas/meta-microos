SUMMARY = "Python interface to the Gravitational-Wave Open Data Center archive"
DESCRIPTION = "The gwosc package provides an interface to querying the open data \
releases hosted on https://gw-openscience.org from the GEO, LIGO, and \
Virgo gravitational-wave observatories."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python311-gwosc-0.7.1-1.3.noarch.rpm"
RPM_HASH = "f8286c17af0470d33f1ea61dd2089b13027e172b39bd31a6ecf4fcda967154891384da980c740207e19b2b56931b585c65f415999d2416b63484043512721d34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gwosc \
python3.11dist-gwosc \
python311-gwosc \
python3dist-gwosc"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
