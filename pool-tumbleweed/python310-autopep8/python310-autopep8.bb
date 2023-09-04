SUMMARY = "Automatic generated to pep8 checked code"
DESCRIPTION = "Autopep8 is automatic generated to pep8 checked code. \
This is old style tool, wrapped pep8 via subprocess module."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python310-autopep8-2.0.2-2.1.noarch.rpm"
RPM_HASH = "3e37c788c18aaacb6b16d692e89e37664aa6d2b5737b3c4ec45cec44d6c62e194f7ec31462d4c1bf53cf2bde00acbde664e4cecaf7fd6a00e1d17b4876044397"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-autopep8 \
python310-autopep8 \
python3dist-autopep8"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-pycodestyle \
python310-tomli \
update-alternatives"

inherit rpm
