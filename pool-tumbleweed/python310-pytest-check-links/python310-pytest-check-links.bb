SUMMARY = "Pytest plugin for checking links in files"
DESCRIPTION = "A pytest plugin that checks URLs for HTML-containing files."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "python310-pytest-check-links-0.9.0-1.1.noarch.rpm"
RPM_HASH = "8d718a98da7fb0a263565c39dbc95926a95d853d48a2fd6ec4308b3ceedac9e64ba0f9d942920f291435befd902efac9983c7e6da3e10432ba6d3ff4eff798b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-check-links \
python310-pytest-check-links \
python3dist-pytest-check-links"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-docutils \
python310-html5lib \
python310-pytest \
python310-requests \
update-alternatives"

inherit rpm
