SUMMARY = "Pytest plugin for checking links in files"
DESCRIPTION = "A pytest plugin that checks URLs for HTML-containing files."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "python310-pytest-check-links-0.8.0-1.4.noarch.rpm"
RPM_HASH = "5705b9cebb247181552a9296f796ed7fc2898af712696d5381c5cdb9822dbef8c0d6d8f3d983529d83980580239c7e2116d629eeced4426f643a299a3acecd5f"
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
