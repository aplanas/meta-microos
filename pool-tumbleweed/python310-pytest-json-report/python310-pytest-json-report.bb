SUMMARY = "A pytest plugin to report test results as JSON files"
DESCRIPTION = "A pytest plugin to report test results as JSON files"
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python310-pytest-json-report-1.5.0-1.5.noarch.rpm"
RPM_HASH = "e4b3b9a65f51032a4189fa04a665fa1929afb296680bf90f0072c72b460cbbb2811c6403e6c56ffac0c8ade1570b1e04c16de5c2b1c66bcf1462e0ec38fd0f9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-json-report \
python310-pytest-json-report \
python3dist-pytest-json-report"

RDEPENDS:${PN} += "python-abi \
python310-py \
python310-pytest \
python310-pytest-metadata"

inherit rpm
