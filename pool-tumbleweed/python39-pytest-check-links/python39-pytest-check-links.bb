SUMMARY = "Pytest plugin for checking links in files"
DESCRIPTION = "A pytest plugin that checks URLs for HTML-containing files."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "python39-pytest-check-links-0.8.0-1.4.noarch.rpm"
RPM_HASH = "b002508164545ccdab77f51ef6c44cba8f14d08200c8ab7adc6389271028bf4b3cb5f8bcb140be66efbce1864a4cfd8a34067c1044cd41d5e19c175f527e46bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-check-links \
python39-pytest-check-links \
python3dist-pytest-check-links"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-docutils \
python39-html5lib \
python39-pytest \
python39-requests \
update-alternatives"

inherit rpm
