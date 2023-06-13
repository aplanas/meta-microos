SUMMARY = "GPX file parser and GPS track manipulation library"
DESCRIPTION = "A Python library for parsing and manipulating GPX files. \
GPX is an XML based format for GPS tracks."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python39-gpxpy-1.5.0-1.4.noarch.rpm"
RPM_HASH = "c0439d27f385d59d9671e9c79f4e96730bc994b081781f1c9521a5258935faebfae4d74b18cbeaee94e9ec0b904ef8a685f2646c11088533150697e867398b4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(gpxpy) \
python39-gpxpy \
python3dist(gpxpy)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
