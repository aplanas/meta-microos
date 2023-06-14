SUMMARY = "OGC CSW server implementation written in Python"
DESCRIPTION = "PyCSW implements clause 10 (HTTP protocol binding (Catalogue Services \
for the Web, CSW)) of the OpenGIS Catalogue Service Implementation \
Specification, version 2.0.2.  The  project  is  certified  OGC \
Compliant,  and  is  an  OGC  Reference  Implementation. PyCSW allows \
for the publishing and discovery of geospatial metadata. Existing \
repositories of geospatial metadata can be exposed via OGC:CSW 2.0.2."
LICENSE = "MIT"

PV = "2.6.1"

RPM_NAME = "python311-pycsw-2.6.1-1.4.noarch.rpm"
RPM_HASH = "a84e41f65462b72de83554da5a9c3974e0c84eff7ca5baf2748d6969607706d9cc613e4cbadd12729d681b20226a87c284003a7ce2c06b3e799fd3a68e3ea5b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pycsw \
python311-pycsw \
python3dist-pycsw"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-OWSLib \
python311-Shapely \
python311-geolinks \
python311-lxml \
python311-pyproj \
python311-xmltodict \
update-alternatives"

inherit rpm
