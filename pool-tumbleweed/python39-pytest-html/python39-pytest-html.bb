SUMMARY = "Pytest plugin for generating HTML reports"
DESCRIPTION = "A plugin for pytest that generates a HTML report for test results."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "python39-pytest-html-3.2.0-2.3.noarch.rpm"
RPM_HASH = "63beb1cbe381b8e031d7c3538b0290454f5e2700dfd9f724738a132c13eb4f9a9a8af9803ac11c93ff62d265fb118b4bbccb423f34d44ae332ce6c8f39005820"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-html \
python39-pytest-html \
python3dist-pytest-html"

RDEPENDS:${PN} += "python-abi \
python39-ansi2html \
python39-py \
python39-pytest \
python39-pytest-metadata"

inherit rpm
