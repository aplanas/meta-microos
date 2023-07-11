SUMMARY = "Python ini2toml[lite] extra requirement"
DESCRIPTION = "The ini2toml[lite] extra requirements for python39-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python39-ini2toml-lite-0.12-2.2.noarch.rpm"
RPM_HASH = "b331e5c840d7a53cfaaea45c7418ab23231ad920f179c769f8486f3b91c83af847955a3f70d6bfe0014fb4cffc3580fb42049c5f0f596e1a0887939e9f1bda18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-ini2toml-lite"

RDEPENDS:${PN} += "-python39-tomli-w >= 0.4.0 with python39-tomli-w < 2 \
python39-ini2toml"

inherit rpm
