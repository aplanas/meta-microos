SUMMARY = "A tool for discovering and downloading publicly available satellite imagery"
DESCRIPTION = "Sat-search is a Python 3 library and a command line tool for discovering \
and downloading publicly available satellite imagery using a conformant \
API such as sat-api."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-sat-search-0.3.0-1.6.noarch.rpm"
RPM_HASH = "7ef000708356c867754bd0c751b2d792fed4f88737483e2404ce65c1a2c43b68bf0c186837e62c91e769bb08f842b71f57e3b5dd076921e3553d803d964bb16f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sat-search \
python39-sat-search \
python3dist-sat-search"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-sat-stac \
update-alternatives"

inherit rpm
