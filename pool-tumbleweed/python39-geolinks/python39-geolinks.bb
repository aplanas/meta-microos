SUMMARY = "Utilities to deal with geospatial links"
DESCRIPTION = "Python implementation of Cat-Interop utilities for geospatial links."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-geolinks-0.2.0-1.15.noarch.rpm"
RPM_HASH = "567a0e672a6b276b14488d3dba14a01bec93f9607d78f79397e2d1219da9f9977835980a87643cda81422c8eeec243773572bf4e689aa295cb49746ea052e156"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-geolinks \
python39-geolinks \
python3dist-geolinks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
