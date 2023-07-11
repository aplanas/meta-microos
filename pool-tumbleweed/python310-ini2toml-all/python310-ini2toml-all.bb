SUMMARY = "Python ini2toml[all] extra requirement"
DESCRIPTION = "The ini2toml[all] extra requirements for python310-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python310-ini2toml-all-0.12-2.2.noarch.rpm"
RPM_HASH = "fac67e98c23e28c609d64b2ce25554ae497d9a5b8a1fdcbc6bb923d599082cbae6992c9b7f70cce54c0cad72092b8d8359e3305922ddd674be93889e0bbb6652"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-ini2toml-all"

RDEPENDS:${PN} += "-python310-configupdater >= 3.0.1 with python310-configupdater < 4 \
-python310-tomli-w >= 0.4.0 with python310-tomli-w < 2 \
-python310-tomlkit >= 0.10 with python310-tomlkit < 2 \
python310-ini2toml"

inherit rpm
