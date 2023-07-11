SUMMARY = "GPX file parser and GPS track manipulation library"
DESCRIPTION = "A Python library for parsing and manipulating GPX files. \
GPX is an XML based format for GPS tracks."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python39-gpxpy-1.5.0-1.5.noarch.rpm"
RPM_HASH = "b55f8ec18d1172b843ee2f82ce5a86b70b64c58e8db6dae5f98ad8a47fd46b84e6c2f241d56e946a3444e27f742df127fad2e97e675c67cf8e1175796776dc11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gpxpy \
python39-gpxpy \
python3dist-gpxpy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
