SUMMARY = "Async database support for Python"
DESCRIPTION = "Async database support for Python."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python311-databases-0.7.0-2.1.noarch.rpm"
RPM_HASH = "bc480b5021592d1465bb03c49c7d08b5e19918267176aeab1187b10d408e0b58e214421ed4531f1353d261b68aae9134114329879ef0fc1978ed79e215250640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-databases \
python3.11dist-databases \
python311-databases \
python3dist-databases"

RDEPENDS:${PN} += "-python311-sqlalchemy >= 1.4 with python311-sqlalchemy < 2 \
python-abi"

inherit rpm
