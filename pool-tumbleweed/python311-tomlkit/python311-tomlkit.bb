SUMMARY = "Style preserving TOML library"
DESCRIPTION = "Style preserving TOML library"
LICENSE = "MIT"

PV = "0.12.1"

RPM_NAME = "python311-tomlkit-0.12.1-1.1.noarch.rpm"
RPM_HASH = "c2de46d3ff7a663cd3ebf42dfa433c9d94d3c09db9f2bc6aba954b3da493513380b8e71b26782a802ac9204bd34037c5bf5b2e28062ade0c825306dc2a0206aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tomlkit \
python3.11dist-tomlkit \
python311-tomlkit \
python3dist-tomlkit"

RDEPENDS:${PN} += "python-abi"

inherit rpm
