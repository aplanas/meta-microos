SUMMARY = "Python modules for interacting with Fedora Services"
DESCRIPTION = "Python modules for interacting with Fedora Services."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "python310-python-fedora-1.1.1-1.6.noarch.rpm"
RPM_HASH = "bd7a0e3d10d67193b29d1c637c758ee883e0d3fbee8739deb8c5783667b6263918cde841289edf78749ffc7cd2efbb631e80e3893541dd5af4fbe244ec912d6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-fedora \
python310-python-fedora \
python3dist-python-fedora"

RDEPENDS:${PN} += "python-abi \
python310-beautifulsoup4 \
python310-kitchen \
python310-lockfile \
python310-munch \
python310-openidc-client \
python310-requests \
python310-six"

inherit rpm
