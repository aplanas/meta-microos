SUMMARY = "Pytest plugin for generating HTML reports"
DESCRIPTION = "A plugin for pytest that generates a HTML report for test results."
LICENSE = "MPL-2.0"

PV = "4.0.0rc5"

RPM_NAME = "python310-pytest-html-4.0.0rc5-1.1.noarch.rpm"
RPM_HASH = "18c6166719d83ea04d8302172427071c1b41194dee8cd2b7712626e572ae1f8913ecdd3d14ae6f8af0369866790af953220be57a86cfb50d1aded98eaaedff85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-html \
python310-pytest-html \
python3dist-pytest-html"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-pytest \
python310-pytest-metadata"

inherit rpm
