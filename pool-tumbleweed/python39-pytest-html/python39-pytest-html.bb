SUMMARY = "Pytest plugin for generating HTML reports"
DESCRIPTION = "A plugin for pytest that generates a HTML report for test results."
LICENSE = "MPL-2.0"

PV = "4.0.0"

RPM_NAME = "python39-pytest-html-4.0.0-1.1.noarch.rpm"
RPM_HASH = "70a4c9f2b892fb1417aad9601889a6a38642073da34495500225aebc9e92ebf1eb9e2007ac518425085b321ce3651e0b323b4581cc1af1b0e49598daaab5a64b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-html \
python39-pytest-html \
python3dist-pytest-html"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-pytest \
python39-pytest-metadata"

inherit rpm
