SUMMARY = "A library for installing Python wheels"
DESCRIPTION = "A library for installing Python wheels."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-installer-0.7.0-2.3.noarch.rpm"
RPM_HASH = "3206c3f1c832eb9fbaa29ac0fea83a805dc2be507912f4be5b2e86ca37513ffc76a8386c752a246f71fce35b9ae7372c4a2c836fea2c91e5cce0321ecbed5ea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-installer \
python39-installer \
python3dist-installer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
