SUMMARY = "Option groups, constraints, subcommand sections and help themes for Click"
DESCRIPTION = "This module adds features to python-click: option groups, \
constraints, subcommand sections and help themes."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python39-cloup-3.0.0-1.1.noarch.rpm"
RPM_HASH = "7b3d1955369681b1284f0cc93765d3145218a8a11f79de825ab166c897bc0edb124fb390c087ffb03bccf7b612a0bf3b5cb52f9dd69482344e998a307c53e37e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cloup \
python39-cloup \
python3dist-cloup"

RDEPENDS:${PN} += "python-abi \
python39-click"

inherit rpm
