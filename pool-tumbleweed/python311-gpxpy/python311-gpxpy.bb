SUMMARY = "GPX file parser and GPS track manipulation library"
DESCRIPTION = "A Python library for parsing and manipulating GPX files. \
GPX is an XML based format for GPS tracks."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python311-gpxpy-1.5.0-1.5.noarch.rpm"
RPM_HASH = "2c16a8946d993abb5712fbc65ebb1303ccfba5704a22a5adee9cd9ba94151a85029a807c6c982bba8e1f337be78b93330a1ddf7063df4f2ccddf864facdf5994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gpxpy \
python3.11dist-gpxpy \
python311-gpxpy \
python3dist-gpxpy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
