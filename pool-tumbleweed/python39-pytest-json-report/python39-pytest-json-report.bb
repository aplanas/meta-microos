SUMMARY = "A pytest plugin to report test results as JSON files"
DESCRIPTION = "A pytest plugin to report test results as JSON files"
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python39-pytest-json-report-1.5.0-1.3.noarch.rpm"
RPM_HASH = "7722a9f4e00f818cd57ba6ea8d884352e79bed89fb94ad0d21dfbf80c3611d164f960cb007c01d650d689a6baf668184e48751f11e4335a742fa70f670e2f18c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-json-report) \
python39-pytest-json-report \
python3dist(pytest-json-report)"

RDEPENDS:${PN} += "python(abi) \
python39-py \
python39-pytest \
python39-pytest-metadata"

inherit rpm
