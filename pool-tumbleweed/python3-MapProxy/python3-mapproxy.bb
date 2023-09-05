SUMMARY = "Proxy for geospatial data"
DESCRIPTION = "MapProxy is an open source proxy for geospatial data. It caches, \
accelerates and transforms data from existing map services and \
serves any desktop or web GIS client."
LICENSE = "Apache-2.0"

PV = "1.16.0"

RPM_NAME = "python3-MapProxy-1.16.0-1.1.noarch.rpm"
RPM_HASH = "aba06be6dc39856de4de1839e93bcf0d2e473af84896ad962b58d50e96bf203be909a56b8a73b20ce6cbbdc528d7c4c98d6804765a53b8ac924b29e4e8f50e53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-MapProxy \
python3.11dist-mapproxy \
python3dist-mapproxy"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
libgeos-c1 \
proj \
python-abi \
python3-Pillow \
python3-PyYAML \
update-alternatives"

inherit rpm
