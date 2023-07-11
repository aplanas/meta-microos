SUMMARY = "Pytest plugin for checking links in files"
DESCRIPTION = "A pytest plugin that checks URLs for HTML-containing files."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "python311-pytest-check-links-0.8.0-1.4.noarch.rpm"
RPM_HASH = "355ab42ca54a54e767bbcd3de712a8f32554f4afe01117fab70a157f7b294aff5fe3ca31879c057ed6b3a356b7fbf23b92ab085239a87c53fccf76e045294e92"
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
