SUMMARY = "Option groups, constraints, subcommand sections and help themes for Click"
DESCRIPTION = "This module adds features to python-click: option groups, \
constraints, subcommand sections and help themes."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-cloup-2.1.0-1.1.noarch.rpm"
RPM_HASH = "32a230e2e401aabf04678f497af2c528a390f54731e6a0234ec99fb9f23d800b9a67ba0586fca8b6b95cc4fd4aead537b97a2db5e3338353d1db6b4f58766e64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cloup \
python3.10dist-cloup \
python310-cloup \
python3dist-cloup"

RDEPENDS:${PN} += "python-abi \
python310-click"

inherit rpm
