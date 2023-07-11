SUMMARY = "A pytest plugin to report test results as JSON files"
DESCRIPTION = "A pytest plugin to report test results as JSON files"
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python39-pytest-json-report-1.5.0-1.5.noarch.rpm"
RPM_HASH = "b27b547195fc8ff40df6c653e86de811f747698027735956441dedae62f723ee2620c8b9fcb85ce76ec744aacb134bddec38955f062b79ce5b3c15f15f24b271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-json-report \
python39-pytest-json-report \
python3dist-pytest-json-report"

RDEPENDS:${PN} += "python-abi \
python39-py \
python39-pytest \
python39-pytest-metadata"

inherit rpm
