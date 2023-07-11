SUMMARY = "Python modules for interacting with Fedora Services"
DESCRIPTION = "Python modules for interacting with Fedora Services."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "python311-python-fedora-1.1.1-1.6.noarch.rpm"
RPM_HASH = "df5553dc92b12fc79df38b572183d72ba93b795d57f5c78b0e7a8e359b7ee48e18040c726ea490c973d80654f25d7f10ed05ba471a4cb9381bcd63ec593abdf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-fedora \
python3.11dist-python-fedora \
python311-python-fedora \
python3dist-python-fedora"

RDEPENDS:${PN} += "python-abi \
python311-beautifulsoup4 \
python311-kitchen \
python311-lockfile \
python311-munch \
python311-openidc-client \
python311-requests \
python311-six"

inherit rpm
