SUMMARY = "Pytest plugin for generating HTML reports"
DESCRIPTION = "A plugin for pytest that generates a HTML report for test results."
LICENSE = "MPL-2.0"

PV = "4.0.0"

RPM_NAME = "python311-pytest-html-4.0.0-1.1.noarch.rpm"
RPM_HASH = "ee5eca2f5303cc85552ec790689957cd41b992030a6e8a9c6482a77eeef5b67cc33bcdbf32de8e5c8160d27e11448feab0cafda1e35b1e512fc867324612c1aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-html \
python3.11dist-pytest-html \
python311-pytest-html \
python3dist-pytest-html"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-pytest \
python311-pytest-metadata"

inherit rpm
