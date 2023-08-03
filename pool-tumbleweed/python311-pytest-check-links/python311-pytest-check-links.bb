SUMMARY = "Pytest plugin for checking links in files"
DESCRIPTION = "A pytest plugin that checks URLs for HTML-containing files."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "python311-pytest-check-links-0.9.0-1.1.noarch.rpm"
RPM_HASH = "161cc9f5fcab436d2e970e65cd44962ae7d73e410c6b4b76e053977270b54c1289f01a2d768b3c8d666409c37ceb941cc40c6ae16c4275cadd0ff4fb41d8b806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-check-links \
python3.11dist-pytest-check-links \
python311-pytest-check-links \
python3dist-pytest-check-links"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-docutils \
python311-html5lib \
python311-pytest \
python311-requests \
update-alternatives"

inherit rpm
