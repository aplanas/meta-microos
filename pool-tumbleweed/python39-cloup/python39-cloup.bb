SUMMARY = "Option groups, constraints, subcommand sections and help themes for Click"
DESCRIPTION = "This module adds features to python-click: option groups, \
constraints, subcommand sections and help themes."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "python39-cloup-2.1.2-1.1.noarch.rpm"
RPM_HASH = "b923e48e59f7e61d801c58de9b6283952d171039f6aceddc7ca5bd4b6dc165508c066a626b4331d17fcce5b7d6ce9bfa42e562881a4a026e8206e6c1733afa47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cloup \
python39-cloup \
python3dist-cloup"

RDEPENDS:${PN} += "python-abi \
python39-click"

inherit rpm
