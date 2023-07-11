SUMMARY = "Option groups, constraints, subcommand sections and help themes for Click"
DESCRIPTION = "This module adds features to python-click: option groups, \
constraints, subcommand sections and help themes."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "python39-cloup-2.1.1-1.3.noarch.rpm"
RPM_HASH = "5f3a5759144a5470b491d39089e5b1f8a43d77450f6dcc545eb531e91a023fd12a60dfe0f857fe1731c5ef7fa5941896b30c3d7d8712ea9248422d4de71c1ae1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cloup \
python39-cloup \
python3dist-cloup"

RDEPENDS:${PN} += "python-abi \
python39-click"

inherit rpm
