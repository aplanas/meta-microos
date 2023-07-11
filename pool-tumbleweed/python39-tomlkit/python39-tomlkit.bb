SUMMARY = "Style preserving TOML library"
DESCRIPTION = "Style preserving TOML library"
LICENSE = "MIT"

PV = "0.11.8"

RPM_NAME = "python39-tomlkit-0.11.8-1.3.noarch.rpm"
RPM_HASH = "3a36da9233607591154f9c738eff90fe748f14adf963a62bd25199f895e1a33a7106e1a2584a3bfb7bfa761db1b46809d8d2368950fff8ffba0997ce3baf7780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tomlkit \
python39-tomlkit \
python3dist-tomlkit"

RDEPENDS:${PN} += "python-abi"

inherit rpm
