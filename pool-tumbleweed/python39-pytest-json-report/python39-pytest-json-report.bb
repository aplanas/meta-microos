SUMMARY = "A pytest plugin to report test results as JSON files"
DESCRIPTION = "A pytest plugin to report test results as JSON files"
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python39-pytest-json-report-1.5.0-2.1.noarch.rpm"
RPM_HASH = "e167ebf923a09da5114ea64597f6ef921951c977716ee3317efbcd203a95c158bfb14efc650bd40971da8578e51ef0f2365ca8c6dd0872fdcd3168bee4d13123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-json-report \
python39-pytest-json-report \
python3dist-pytest-json-report"

RDEPENDS:${PN} += "python-abi \
python39-py \
python39-pytest \
python39-pytest-metadata"

inherit rpm
