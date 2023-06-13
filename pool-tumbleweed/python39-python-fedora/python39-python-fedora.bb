SUMMARY = "Python modules for interacting with Fedora Services"
DESCRIPTION = "Python modules for interacting with Fedora Services."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "python39-python-fedora-1.1.1-1.4.noarch.rpm"
RPM_HASH = "8988ee1e6880263774d9842d285e245471ca67b9ef9f7d0914e97aea75988a2ad42963a34989bc3d0f589248d64ed6a547ae2c500696c42c799ff86e9bb63eef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-fedora) \
python39-python-fedora \
python3dist(python-fedora)"

RDEPENDS:${PN} += "python(abi) \
python39-beautifulsoup4 \
python39-kitchen \
python39-lockfile \
python39-munch \
python39-openidc-client \
python39-requests \
python39-six"

inherit rpm
