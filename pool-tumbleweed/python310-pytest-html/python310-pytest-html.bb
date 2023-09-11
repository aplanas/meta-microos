SUMMARY = "Pytest plugin for generating HTML reports"
DESCRIPTION = "A plugin for pytest that generates a HTML report for test results."
LICENSE = "MPL-2.0"

PV = "4.0.0"

RPM_NAME = "python310-pytest-html-4.0.0-1.1.noarch.rpm"
RPM_HASH = "13583060a47d036b3db34973a0b4aba30d16f09ec89571436a7ae451789e7be813d06641620f01ab2e5ee518b02d25393ca759659993f6da0b13d84239aaf74e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-html \
python310-pytest-html \
python3dist-pytest-html"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-pytest \
python310-pytest-metadata"

inherit rpm
