SUMMARY = "Additional argparse types and actions"
DESCRIPTION = "Additional argparse types and actions."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python39-argparse_addons-0.12.0-1.3.noarch.rpm"
RPM_HASH = "9c6ae94cc05243fce40a669aa5d7a447fb3c81c13c26414dcb37419f535e01c28fca788a90996dd5fc8b5f92db3cd432b6a8a13d890d1b73ecedd3e68bbe08eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-argparse-addons \
python39-argparse-addons \
python3dist-argparse-addons"

RDEPENDS:${PN} += "python-abi"

inherit rpm
