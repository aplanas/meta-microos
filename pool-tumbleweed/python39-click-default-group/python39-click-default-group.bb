SUMMARY = "Extends clickGroup to invoke a command without explicit subcommand name"
DESCRIPTION = "Extends click.Group to invoke a command without explicit subcommand name."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "python39-click-default-group-1.2.2-2.10.noarch.rpm"
RPM_HASH = "3a23718dee46a71174b9bdc6495d1e984d4e3adabcd5a25e9e4c149b8900fe03f1e771d6706733299c84f8e8be9f83e556978e0a92f23c40a11ed3389b3298e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-click-default-group \
python39-click-default-group \
python3dist-click-default-group"

RDEPENDS:${PN} += "python-abi \
python39-click"

inherit rpm
