SUMMARY = "A pytest plugin to report test results as JSON files"
DESCRIPTION = "A pytest plugin to report test results as JSON files"
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python311-pytest-json-report-1.5.0-1.3.noarch.rpm"
RPM_HASH = "4987d7df456fc8250a07b83e60eb8892bf6aebb531c6ff81c49e3fe5c947c3bd081a09783b0526824b2cbfb8982445ddc2f15cdbda3c455d724e5d75d2920eea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-json-report) \
python311-pytest-json-report \
python3dist(pytest-json-report)"
RDEPENDS:${PN} += "python(abi) \
python311-py \
python311-pytest \
python311-pytest-metadata"

inherit rpm
