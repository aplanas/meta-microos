SUMMARY = "Flake8 Builtins plugin"
DESCRIPTION = "This plugin checks for Python builtins being used as variables or parameters."
LICENSE = "GPL-2.0-only"

PV = "2.1.0"

RPM_NAME = "python311-flake8-builtins-2.1.0-1.5.noarch.rpm"
RPM_HASH = "d3bb2fd1cba4cbd10b1a520f2ba6196946b592fa03480bbbe4ceb2b96ba234d865e3b554de3df19c9b53f31c940dce1b865b90f825783850bd81b6e14922d249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-builtins \
python3.11dist-flake8-builtins \
python311-flake8-builtins \
python3dist-flake8-builtins"

RDEPENDS:${PN} += "python-abi \
python311-flake8"

inherit rpm
