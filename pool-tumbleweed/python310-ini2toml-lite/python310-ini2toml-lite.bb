SUMMARY = "Python ini2toml[lite] extra requirement"
DESCRIPTION = "The ini2toml[lite] extra requirements for python310-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python310-ini2toml-lite-0.12-2.1.noarch.rpm"
RPM_HASH = "82a1c4752e2fc461dc6acf8f83b010f704f92e374d02283fc18e4e7b0ee4be97910500af7a17b5deeeea18435f2771c23d210be554d6611d2f1014219238d438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ini2toml-lite \
python310-ini2toml-lite"

RDEPENDS:${PN} += "-python310-tomli-w >= 0.4.0 with python310-tomli-w < 2 \
python310-ini2toml"

inherit rpm
