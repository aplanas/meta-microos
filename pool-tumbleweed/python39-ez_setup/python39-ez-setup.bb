SUMMARY = "Contains ez_setup.py and distribute_setup.py"
DESCRIPTION = "setup.py of several Python projects blindly import the setuptools bootstrap \
module ez_setup.py without realizing that it is usually not installed in the \
user's machine. This causes much trouble. Include ez_setup.py (and \
distribute_setup.py) as a installable Python package so users can do \
easy_install ez_setup troublesome_package as a workaround."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "python39-ez_setup-0.9-3.4.noarch.rpm"
RPM_HASH = "638678452e51cc02e10e84483c7f0a9e19d2354b000acb0af4a2f6d1a30efb9631341d1d6d877852da7f8cedf04eb58913c0337a4274776332f67a169389dbd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ez-setup \
python39-ez-setup \
python3dist-ez-setup"

RDEPENDS:${PN} += "python-abi"

inherit rpm
