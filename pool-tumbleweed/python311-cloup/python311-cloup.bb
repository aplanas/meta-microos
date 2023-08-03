SUMMARY = "Option groups, constraints, subcommand sections and help themes for Click"
DESCRIPTION = "This module adds features to python-click: option groups, \
constraints, subcommand sections and help themes."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python311-cloup-3.0.0-1.1.noarch.rpm"
RPM_HASH = "de26a4703c0beb51c46b7c9fe0a582e063e718b2178885efd42d268fb0ec8781f64798517a46b01dc32ac1561f3ef3ae9b4e642a37213ac4afb5bf4e33052719"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cloup \
python3.11dist-cloup \
python311-cloup \
python3dist-cloup"

RDEPENDS:${PN} += "python-abi \
python311-click"

inherit rpm
