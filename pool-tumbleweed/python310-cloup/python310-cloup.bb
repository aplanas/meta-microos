SUMMARY = "Option groups, constraints, subcommand sections and help themes for Click"
DESCRIPTION = "This module adds features to python-click: option groups, \
constraints, subcommand sections and help themes."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "python310-cloup-2.1.1-1.3.noarch.rpm"
RPM_HASH = "8c7a3570865cfc512ebd0c1671fec66f722353a62fa5c62f30c75b64987efa4bec950cdce4c133b04f79af78254d48481c324740d7b8a928010e8b1a6077bbb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cloup \
python310-cloup \
python3dist-cloup"

RDEPENDS:${PN} += "python-abi \
python310-click"

inherit rpm
