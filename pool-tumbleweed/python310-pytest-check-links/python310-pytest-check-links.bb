SUMMARY = "Pytest plugin for checking links in files"
DESCRIPTION = "A pytest plugin that checks URLs for HTML-containing files."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "python310-pytest-check-links-0.8.0-1.2.noarch.rpm"
RPM_HASH = "ff58394e250f73e5a1752e0a190109946473edee3531fa6c941af2c77daea1a69fc7b83ecb311e3fff302448f1deb4ba408081b63ee1777737c7ecb3fc1ff324"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-check-links \
python3.10dist(pytest-check-links) \
python310-pytest-check-links \
python3dist(pytest-check-links)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-docutils \
python310-html5lib \
python310-pytest \
python310-requests \
update-alternatives"

inherit rpm
