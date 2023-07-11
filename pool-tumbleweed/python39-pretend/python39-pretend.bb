SUMMARY = "A library for stubbing in Python"
DESCRIPTION = "Pretend is a library to make stubbing with Python easier."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "python39-pretend-1.0.9-3.3.noarch.rpm"
RPM_HASH = "fed41cd9289462b68a9dc13388c6e94f65bffc567bcebe85bf15ddff2eb1add295eb75fe46481f92f1c2363a12bcf365c2a61a72c11cadae5752b9af9371c589"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pretend \
python39-pretend \
python3dist-pretend"

RDEPENDS:${PN} += "python-abi"

inherit rpm
