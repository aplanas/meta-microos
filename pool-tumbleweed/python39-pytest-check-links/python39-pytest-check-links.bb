SUMMARY = "Pytest plugin for checking links in files"
DESCRIPTION = "A pytest plugin that checks URLs for HTML-containing files."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "python39-pytest-check-links-0.8.0-1.2.noarch.rpm"
RPM_HASH = "bcb7c79a5f431b1919b81cae500d7cf1f9b6683358b91f4ff74f4b639262fc549ab612854ef86975ce518f49886af14a06a6a2a9f1e09d0e3b256edf6f030495"
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
