SUMMARY = "Python modules for interacting with Fedora Services"
DESCRIPTION = "Python modules for interacting with Fedora Services."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "python310-python-fedora-1.1.1-1.4.noarch.rpm"
RPM_HASH = "b13398eae9ee0f84503833fb19bd2bb1d9961bd530916387b1b86300eeffed46383e1bcb6c18a3e30ed5458c0b4ca7c8fcc0dff357385c4c6d1fad42aae96f29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-fedora \
python3.10dist(python-fedora) \
python310-python-fedora \
python3dist(python-fedora)"
RDEPENDS:${PN} += "python(abi) \
python310-beautifulsoup4 \
python310-kitchen \
python310-lockfile \
python310-munch \
python310-openidc-client \
python310-requests \
python310-six"

inherit rpm
