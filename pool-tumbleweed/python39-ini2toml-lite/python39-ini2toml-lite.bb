SUMMARY = "Python ini2toml[lite] extra requirement"
DESCRIPTION = "The ini2toml[lite] extra requirements for python39-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python39-ini2toml-lite-0.12-2.1.noarch.rpm"
RPM_HASH = "1213218448726f9138077e13f86460ae619e2415b4c1aa3d90be79b034ef75ee52bd2a46c4704593e53ef6268c7deba946de5513c4b93d82d3a66e29679694f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-ini2toml-lite"

RDEPENDS:${PN} += "(python39-importlib-metadata if python39-base < 3.8) \
(python39-tomli-w >= 0.4.0 with python39-tomli-w < 2) \
python39-ini2toml"

inherit rpm
