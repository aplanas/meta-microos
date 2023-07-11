SUMMARY = "Contains ez_setup.py and distribute_setup.py"
DESCRIPTION = "setup.py of several Python projects blindly import the setuptools bootstrap \
module ez_setup.py without realizing that it is usually not installed in the \
user's machine. This causes much trouble. Include ez_setup.py (and \
distribute_setup.py) as a installable Python package so users can do \
easy_install ez_setup troublesome_package as a workaround."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "python310-ez_setup-0.9-3.4.noarch.rpm"
RPM_HASH = "f8e91d06be20565a6ee7446381d14da4f0e00fa790771d439d6872b85ca02eb0e8de792503f61ea4295c6ff6e04edc7d3c7f00a6ae505249bc1a0928c41169ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ez-setup \
python310-ez-setup \
python3dist-ez-setup"

RDEPENDS:${PN} += "python-abi"

inherit rpm
