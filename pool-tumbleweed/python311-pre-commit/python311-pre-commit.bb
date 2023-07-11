SUMMARY = "Multi-language pre-commit hooks"
DESCRIPTION = "A framework for managing and maintaining multi-language pre-commit hooks."
LICENSE = "MIT"

PV = "2.21.0"

RPM_NAME = "python311-pre-commit-2.21.0-1.7.noarch.rpm"
RPM_HASH = "61daa807d8904294b607b3f82e03af3eeffd8f1814164bee2ad9274714165fdbd7941129e4b74812dc08a42488e6439ca8191b7932e6923d8633f72dcbb1712c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pre-commit \
python3.11dist-pre-commit \
python311-pre-commit \
python3dist-pre-commit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-cfgv \
python311-identify \
python311-nodeenv \
python311-re-assert \
python311-toml \
python311-virtualenv \
update-alternatives"

inherit rpm
