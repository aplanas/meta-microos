SUMMARY = "Building newsfiles for your project"
DESCRIPTION = "Building newsfiles for your project."
LICENSE = "MIT"

PV = "19.2.0"

RPM_NAME = "python39-towncrier-19.2.0-2.15.noarch.rpm"
RPM_HASH = "60c0081fd9f82bd5f0c254c756218b91081d415e6efd22ea58d311617b06a9595d4a3409e371802948cd9cc2c729f94b3a107869ece3fc8718fb709b970796fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-towncrier \
python39-towncrier \
python3dist-towncrier"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
git-core \
python-abi \
python39-Jinja2 \
python39-click \
python39-incremental \
python39-toml \
update-alternatives"

inherit rpm
