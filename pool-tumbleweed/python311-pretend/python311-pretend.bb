SUMMARY = "A library for stubbing in Python"
DESCRIPTION = "Pretend is a library to make stubbing with Python easier."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "python311-pretend-1.0.9-3.3.noarch.rpm"
RPM_HASH = "55e006ca36428a3ea6bb59a083c3b1470de770e7a4281e65e154d8012d6fc60f3b16341d16984887dc950ce5110ffe3b7b7dfdadc26e664a5dabe4eb99a0fa78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pretend \
python3.11dist-pretend \
python311-pretend \
python3dist-pretend"

RDEPENDS:${PN} += "python-abi"

inherit rpm
