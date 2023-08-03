SUMMARY = "Option groups, constraints, subcommand sections and help themes for Click"
DESCRIPTION = "This module adds features to python-click: option groups, \
constraints, subcommand sections and help themes."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python310-cloup-3.0.0-1.1.noarch.rpm"
RPM_HASH = "8aee4fda82a4b83bad5cdfeac271b4bbcee3bab1edc7745ae4d800ae905dc71b03feb4ec26eb5a00ff8c2e0c43e8f8c897be4ff8c168765778f3e1efba3b701a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cloup \
python310-cloup \
python3dist-cloup"

RDEPENDS:${PN} += "python-abi \
python310-click"

inherit rpm
