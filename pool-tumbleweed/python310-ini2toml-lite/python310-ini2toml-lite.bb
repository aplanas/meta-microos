SUMMARY = "Python ini2toml[lite] extra requirement"
DESCRIPTION = "The ini2toml[lite] extra requirements for python310-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python310-ini2toml-lite-0.12-2.2.noarch.rpm"
RPM_HASH = "c2318ae6dba812d7721ba3a2f26a5de3276e04b02721361d508c1d8a91dbd837036929044787b248d6473d645f9f6740dc2c2405430eb2130b98da5b1f336d7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-ini2toml-lite"

RDEPENDS:${PN} += "-python310-tomli-w >= 0.4.0 with python310-tomli-w < 2 \
python310-ini2toml"

inherit rpm
