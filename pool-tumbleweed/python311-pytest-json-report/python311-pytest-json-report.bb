SUMMARY = "A pytest plugin to report test results as JSON files"
DESCRIPTION = "A pytest plugin to report test results as JSON files"
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python311-pytest-json-report-1.5.0-1.5.noarch.rpm"
RPM_HASH = "f037b0e367d92d762476b7fa2334521f091dc8c17ee21b9b45cd33cc908e77f44cde4a8482d5e9537fc50d3d6a3cc3fd3fb75ab93d4189670e4eec66cb8b0b2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-json-report \
python3.11dist-pytest-json-report \
python311-pytest-json-report \
python3dist-pytest-json-report"

RDEPENDS:${PN} += "python-abi \
python311-py \
python311-pytest \
python311-pytest-metadata"

inherit rpm
