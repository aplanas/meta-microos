SUMMARY = "Tools to work with Tidelift"
DESCRIPTION = "jaraco.tidelift Tools for Tidelift"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python311-jaraco.tidelift-1.5.1-1.1.noarch.rpm"
RPM_HASH = "adf3560d629abcc5038bddbb422c39c07d33770eda47a9ad5412a49ad3a0f2e39e698740c9673d4a64fb7750d398e3b843230aaed4e3a0cc30720c2df8c27dfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jaraco.tidelift \
python311-jaraco.tidelift \
python3dist-jaraco.tidelift"

RDEPENDS:${PN} += "python-abi \
python311-autocommand \
python311-importlib-resources \
python311-keyring \
python311-requests-toolbelt"

inherit rpm
