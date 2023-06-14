SUMMARY = "Additional argparse types and actions"
DESCRIPTION = "Additional argparse types and actions."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python39-argparse_addons-0.12.0-1.1.noarch.rpm"
RPM_HASH = "891b3d14dc9678419a25c1862aae1bb51f1300c17b99c19650c3dfde880bb4bb7415339bf87902ce10876b1b5bbd1cc6149b8eedb710fe7b5d11cd44ee29f009"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-argparse-addons \
python39-argparse-addons \
python3dist-argparse-addons"

RDEPENDS:${PN} += "python-abi"

inherit rpm
