SUMMARY = "Utilities to deal with geospatial links"
DESCRIPTION = "Python implementation of Cat-Interop utilities for geospatial links."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-geolinks-0.2.0-1.14.noarch.rpm"
RPM_HASH = "56e2069828a622776b3b9052f8d28c681b75e4b53933233b7dab1f52059490361fc9da54d431f6dff81dc559c9d6d18a402d70278669506b870cb3c4880b012f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-geolinks \
python39-geolinks \
python3dist-geolinks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
