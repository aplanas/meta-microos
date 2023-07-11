SUMMARY = "Python ini2toml[full] extra requirement"
DESCRIPTION = "The ini2toml[full] extra requirements for python310-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python310-ini2toml-full-0.12-2.2.noarch.rpm"
RPM_HASH = "3ffda82b04cad622902a81193b25803efa2ca3009c973917d53b2800655cd5f0b4428bbbc4d1e56a9451c4c8473a67002ef4465743efd314364a8242b680e745"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-ini2toml-full"

RDEPENDS:${PN} += "-python310-configupdater >= 3.0.1 with python310-configupdater < 4 \
-python310-tomlkit >= 0.10 with python310-tomlkit < 2 \
python310-ini2toml"

inherit rpm
