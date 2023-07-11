SUMMARY = "Proxy for geospatial data"
DESCRIPTION = "MapProxy is an open source proxy for geospatial data. It caches, \
accelerates and transforms data from existing map services and \
serves any desktop or web GIS client."
LICENSE = "Apache-2.0"

PV = "1.15.1"

RPM_NAME = "python3-MapProxy-1.15.1-1.3.noarch.rpm"
RPM_HASH = "b9954f4e03368a480004be376b529e42c5d5d17fc1912cbfa2a78adc9065c606c8aaeb4cd677a3910cb1b82d6885ff60d09cc2e85730e218a321edd0cd42bef3"
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
