SUMMARY = "GPX file parser and GPS track manipulation library"
DESCRIPTION = "A Python library for parsing and manipulating GPX files. \
GPX is an XML based format for GPS tracks."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python310-gpxpy-1.5.0-1.5.noarch.rpm"
RPM_HASH = "451f60b13be8a16b6bdec68a2290dabcfed1ca808f2697fbb03c9ea90db23ccc5fb527d88cc654447b5c044bdfcb58073bf68a544b8ac350e71cf394d954c98a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gpxpy \
python310-gpxpy \
python3dist-gpxpy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
