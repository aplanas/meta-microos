SUMMARY = "Setuptools extension for CalVer package versions"
DESCRIPTION = "Setuptools extension for CalVer package versions"
LICENSE = "Apache-2.0"

PV = "2022.6.26"

RPM_NAME = "python39-calver-2022.6.26-2.1.noarch.rpm"
RPM_HASH = "89a5d889d3dc962a14ece39610c323d6576202bd7d14c57f288a67501fedb5628deebe0ac0b27274989dc26c3711a0507917d776f86d0b9741594609b9492fa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-calver \
python39-calver \
python3dist-calver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
