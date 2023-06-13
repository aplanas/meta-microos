SUMMARY = "Parsing, validation and query functions for packaging metadata"
DESCRIPTION = "Python module for parsing, validating and querying distribution/packaging \
metadata stored in human readable and reviewable text/YAML files."
LICENSE = "Apache-2.0"

PV = "0.6.2"

RPM_NAME = "python39-distroinfo-0.6.2-1.2.noarch.rpm"
RPM_HASH = "0edd51e356f312cb60be93eb185b22a8ee7344fe4d177017a5736f694673745ecf77a8677734ce8196cd5bb3d8cb0a9a2d4f1b1a8d5c80e9267a83dc9aab9a4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(distroinfo) \
python39-distroinfo \
python3dist(distroinfo)"

RDEPENDS:${PN} += "python(abi) \
python39-PyYAML \
python39-pbr \
python39-requests \
python39-six"

inherit rpm
