SUMMARY = "Pytest plugin for generating HTML reports"
DESCRIPTION = "A plugin for pytest that generates a HTML report for test results."
LICENSE = "MPL-2.0"

PV = "4.0.0rc5"

RPM_NAME = "python39-pytest-html-4.0.0rc5-1.1.noarch.rpm"
RPM_HASH = "21369e7e336a33251221b444f5834532629b5d5da1aa3318dd075325df6baac9666e418076c9af480fe6d1f4b24470744d8202080336ad899981126a6473fdcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-html \
python39-pytest-html \
python3dist-pytest-html"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-pytest \
python39-pytest-metadata"

inherit rpm
