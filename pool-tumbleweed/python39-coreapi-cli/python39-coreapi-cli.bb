SUMMARY = "An interactive command line client for Core API"
DESCRIPTION = "An interactive command line client for Core API."
LICENSE = "BSD-2-Clause"

PV = "1.0.9"

RPM_NAME = "python39-coreapi-cli-1.0.9-1.24.noarch.rpm"
RPM_HASH = "e9a0788c0aace6899bccd17775f38581fcb0f9ef32f94f2e04b961eef8544b62f283040e5d66675f6941b51fb4243289586d3855ae61c316125c0776fe43a6de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-coreapi-cli \
python39-coreapi-cli \
python3dist-coreapi-cli"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
python39-coreapi \
python39-coreschema \
python39-itypes \
python39-requests \
python39-uritemplate \
update-alternatives"

inherit rpm
