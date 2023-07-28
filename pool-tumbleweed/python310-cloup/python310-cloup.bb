SUMMARY = "Option groups, constraints, subcommand sections and help themes for Click"
DESCRIPTION = "This module adds features to python-click: option groups, \
constraints, subcommand sections and help themes."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "python310-cloup-2.1.2-1.1.noarch.rpm"
RPM_HASH = "bb79bce6c19c8ccadb7963a9c25809bddac1353cddd9cc131e49ea40d753f1b2688d44b8bb04ddfa6e47a8fdd75ebeb7fe700dcf0b91ea2b08b2785574bcb9d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cloup \
python310-cloup \
python3dist-cloup"

RDEPENDS:${PN} += "python-abi \
python310-click"

inherit rpm
