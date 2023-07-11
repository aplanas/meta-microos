SUMMARY = "Contains ez_setup.py and distribute_setup.py"
DESCRIPTION = "setup.py of several Python projects blindly import the setuptools bootstrap \
module ez_setup.py without realizing that it is usually not installed in the \
user's machine. This causes much trouble. Include ez_setup.py (and \
distribute_setup.py) as a installable Python package so users can do \
easy_install ez_setup troublesome_package as a workaround."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "python311-ez_setup-0.9-3.4.noarch.rpm"
RPM_HASH = "ed3ca6b2272eeb1b1d1566809b8ef6850271772e18bec861f45b83f240662454d348f28cee07fe70a0b6545d132ac6f02f99f193c1c04726deed015e2cc9fc02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ez-setup \
python3.11dist-ez-setup \
python311-ez-setup \
python3dist-ez-setup"

RDEPENDS:${PN} += "python-abi"

inherit rpm
