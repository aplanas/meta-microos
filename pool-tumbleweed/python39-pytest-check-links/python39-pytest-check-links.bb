SUMMARY = "Pytest plugin for checking links in files"
DESCRIPTION = "A pytest plugin that checks URLs for HTML-containing files."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "python39-pytest-check-links-0.9.0-1.1.noarch.rpm"
RPM_HASH = "64c3d4a4dbdc6c3f89e05d6587e92cadfa1f9a828c2b4c2c481f6b7c52b39f8a76ba09fcdc66d193febafff7ddabd257593b67ed052a3d20326dc4453e99497e"
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
