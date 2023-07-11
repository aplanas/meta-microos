SUMMARY = "Build backend used by Hatch"
DESCRIPTION = "This is the extensible, standards compliant build backend used by Hatch."
LICENSE = "MIT"

PV = "1.18.0"

RPM_NAME = "python310-hatchling-1.18.0-1.1.noarch.rpm"
RPM_HASH = "5081c6b42963a728bc9947dfe187ce3b8e5d13910bd456d0a6d306e6e9c566000c7c9fa9e2fd0eefc1988d351cfee08f974e5ba3e882891d90c4703ca0a5d9c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hatchling \
python310-hatchling \
python3dist-hatchling"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-editables \
python310-packaging \
python310-pathspec \
python310-pluggy \
python310-tomli \
python310-trove-classifiers \
update-alternatives"

inherit rpm
