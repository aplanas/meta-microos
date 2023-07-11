SUMMARY = "Python modules for interacting with Fedora Services"
DESCRIPTION = "Python modules for interacting with Fedora Services."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "python39-python-fedora-1.1.1-1.6.noarch.rpm"
RPM_HASH = "3aad0ca23641811910c81212fe0b3e70132dfb80c3ef8f50d00feb96726e4e68512d4ce8c5b20d7346ab8942eb75ee3a761adcd45479d84cd130a64850099d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-fedora \
python39-python-fedora \
python3dist-python-fedora"

RDEPENDS:${PN} += "python-abi \
python39-beautifulsoup4 \
python39-kitchen \
python39-lockfile \
python39-munch \
python39-openidc-client \
python39-requests \
python39-six"

inherit rpm
