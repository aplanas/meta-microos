SUMMARY = "Python ini2toml[lite] extra requirement"
DESCRIPTION = "The ini2toml[lite] extra requirements for python311-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python311-ini2toml-lite-0.12-2.2.noarch.rpm"
RPM_HASH = "1b09651d50ed82e07aa71cbfcfec847fb792d5f7228941de213570a981c1ee9de51d7df2a44fb305b89ad62421e1cdb96b7a466d6d361e9ca7da36659cba4cf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ini2toml-lite \
python311-ini2toml-lite"

RDEPENDS:${PN} += "-python311-tomli-w >= 0.4.0 with python311-tomli-w < 2 \
python311-ini2toml"

inherit rpm
