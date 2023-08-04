SUMMARY = "A pytest plugin to report test results as JSON files"
DESCRIPTION = "A pytest plugin to report test results as JSON files"
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python310-pytest-json-report-1.5.0-2.1.noarch.rpm"
RPM_HASH = "e06c2d5ab58d4319f88b7794daa837a87c980dd599eb554851a5725d2d7279cfc56ed8b79ebb85455144cbc18ad3f4085a2db164aa1bd75870fa709071fc5d7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-json-report \
python310-pytest-json-report \
python3dist-pytest-json-report"

RDEPENDS:${PN} += "python-abi \
python310-py \
python310-pytest \
python310-pytest-metadata"

inherit rpm
