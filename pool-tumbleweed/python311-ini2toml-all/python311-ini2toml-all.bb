SUMMARY = "Python ini2toml[all] extra requirement"
DESCRIPTION = "The ini2toml[all] extra requirements for python311-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python311-ini2toml-all-0.12-2.1.noarch.rpm"
RPM_HASH = "468f2e864fcb1eed9c3804e9256050d85ea8054a3e512f367c21df216901f27783835f0f1ec833c03cf1427396bf391822d7dc29e54d66808d5a9e6071977424"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-ini2toml-all"
RDEPENDS:${PN} += "(python311-configupdater >= 3.0.1 with python311-configupdater < 4) \
(python311-importlib-metadata if python311-base < 3.8) \
(python311-tomli-w >= 0.4.0 with python311-tomli-w < 2) \
(python311-tomlkit >= 0.10 with python311-tomlkit < 2) \
python311-ini2toml"

inherit rpm
