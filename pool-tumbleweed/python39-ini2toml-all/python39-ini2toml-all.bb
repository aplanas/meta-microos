SUMMARY = "Python ini2toml[all] extra requirement"
DESCRIPTION = "The ini2toml[all] extra requirements for python39-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python39-ini2toml-all-0.12-2.2.noarch.rpm"
RPM_HASH = "43f83d0285dd164caa41b0eab37e5386ce6d909f9bbb762005a86f2ec6f91ae0cd954ace20992aadaf8ad23378aec3bad5cddcab2d9f83824ad985f310bfa7ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-ini2toml-all"

RDEPENDS:${PN} += "-python39-configupdater >= 3.0.1 with python39-configupdater < 4 \
-python39-tomli-w >= 0.4.0 with python39-tomli-w < 2 \
-python39-tomlkit >= 0.10 with python39-tomlkit < 2 \
python39-ini2toml"

inherit rpm
