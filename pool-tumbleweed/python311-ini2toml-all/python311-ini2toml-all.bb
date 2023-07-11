SUMMARY = "Python ini2toml[all] extra requirement"
DESCRIPTION = "The ini2toml[all] extra requirements for python311-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python311-ini2toml-all-0.12-2.2.noarch.rpm"
RPM_HASH = "85c88fd5781374356eb68d663d35d2d464e2b0fcc489b78dcf453abcc5cf11c1b0974dd4c25415414bf0a30436f929eea90da9e33c3202d6229a6a89176992e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ini2toml-all \
python311-ini2toml-all"

RDEPENDS:${PN} += "-python311-configupdater >= 3.0.1 with python311-configupdater < 4 \
-python311-tomli-w >= 0.4.0 with python311-tomli-w < 2 \
-python311-tomlkit >= 0.10 with python311-tomlkit < 2 \
python311-ini2toml"

inherit rpm
