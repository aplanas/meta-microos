SUMMARY = "A library for installing Python wheels"
DESCRIPTION = "A library for installing Python wheels."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python311-installer-0.7.0-2.3.noarch.rpm"
RPM_HASH = "afcc3dd952635e1ff674c92b547290f4e591b15708742fd4e4d380b61ec1c7f903e6ca46b8d4473ad21154587f7bb1c1328f2dd0915f4eea0b0e4ef7d33853e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-installer \
python3.11dist-installer \
python311-installer \
python3dist-installer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
