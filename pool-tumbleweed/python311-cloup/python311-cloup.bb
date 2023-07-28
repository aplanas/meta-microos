SUMMARY = "Option groups, constraints, subcommand sections and help themes for Click"
DESCRIPTION = "This module adds features to python-click: option groups, \
constraints, subcommand sections and help themes."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "python311-cloup-2.1.2-1.1.noarch.rpm"
RPM_HASH = "b96e83b3de6d79e64bdbbb31caebc38343c0f2ac4cd5104797937b9b3634787eee19d850aa6ecd76609fb512671a62cad8b6ea6625966fb32220d2247dfa5b11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cloup \
python3.11dist-cloup \
python311-cloup \
python3dist-cloup"

RDEPENDS:${PN} += "python-abi \
python311-click"

inherit rpm
