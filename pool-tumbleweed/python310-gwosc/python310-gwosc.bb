SUMMARY = "Python interface to the Gravitational-Wave Open Data Center archive"
DESCRIPTION = "The gwosc package provides an interface to querying the open data \
releases hosted on https://gw-openscience.org from the GEO, LIGO, and \
Virgo gravitational-wave observatories."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python310-gwosc-0.7.1-1.1.noarch.rpm"
RPM_HASH = "9188fdd746740f13f91f065fa002588a78d9f94e31fe40cf5b1e44c8d0b44cc9023b6c6108a7a866c7876fc08ba068866e0f36b21df8b7df45ba7e635c6291d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gwosc \
python3.10dist-gwosc \
python310-gwosc \
python3dist-gwosc"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
