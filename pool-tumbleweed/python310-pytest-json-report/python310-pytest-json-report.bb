SUMMARY = "A pytest plugin to report test results as JSON files"
DESCRIPTION = "A pytest plugin to report test results as JSON files"
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python310-pytest-json-report-1.5.0-1.3.noarch.rpm"
RPM_HASH = "99679cad359041a836362f5d16a424a52d94989847ebfbee55a4f0e34c7a655b589e7e6c0f71a2a86c8ff9d184f6f62564bf9e80c8df62233c80a49e6db7a3ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-json-report \
python3.10dist-pytest-json-report \
python310-pytest-json-report \
python3dist-pytest-json-report"

RDEPENDS:${PN} += "python-abi \
python310-py \
python310-pytest \
python310-pytest-metadata"

inherit rpm
