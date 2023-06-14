SUMMARY = "Python ini2toml[all] extra requirement"
DESCRIPTION = "The ini2toml[all] extra requirements for python310-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python310-ini2toml-all-0.12-2.1.noarch.rpm"
RPM_HASH = "a25d861f170f78092a4fb3617bb4dd0b60e0ba4cdd53751558a3778f3baf177107cea4b23af6d0c30ed8cf92ed9e4b019f635e394a9f7514d7ba5e2f935a5115"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ini2toml-all \
python310-ini2toml-all"

RDEPENDS:${PN} += "-python310-configupdater >= 3.0.1 with python310-configupdater < 4 \
-python310-importlib-metadata if python310-base < 3.8 \
-python310-tomli-w >= 0.4.0 with python310-tomli-w < 2 \
-python310-tomlkit >= 0.10 with python310-tomlkit < 2 \
python310-ini2toml"

inherit rpm
