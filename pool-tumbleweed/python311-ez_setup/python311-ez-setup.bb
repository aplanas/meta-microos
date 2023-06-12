SUMMARY = "Contains ez_setup.py and distribute_setup.py"
DESCRIPTION = "setup.py of several Python projects blindly import the setuptools bootstrap \
module ez_setup.py without realizing that it is usually not installed in the \
user's machine. This causes much trouble. Include ez_setup.py (and \
distribute_setup.py) as a installable Python package so users can do \
easy_install ez_setup troublesome_package as a workaround."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "python311-ez_setup-0.9-3.3.noarch.rpm"
RPM_HASH = "c239dc03d0b1a1c86a8d4063d8f67d8d6e9a9ab5cb3cb64a337b1dd9e88dbbc03d24255c9b38cf9bc03b68a72f93394fc516b30254f6d6290a134803101bad1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ez-setup) \
python311-ez_setup \
python3dist(ez-setup)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
