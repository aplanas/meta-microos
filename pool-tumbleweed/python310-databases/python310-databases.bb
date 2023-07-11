SUMMARY = "Async database support for Python"
DESCRIPTION = "Async database support for Python."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python310-databases-0.7.0-2.1.noarch.rpm"
RPM_HASH = "7dc730846a3cb0d378f1f6a1ff6628d3620eda3feb689dfb9b955b9e49069dc9bf4526a8b319873570c58ee4d04ac5bdc3e5e27b75990dfd76cb4cfeb3fdc6ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-databases \
python310-databases \
python3dist-databases"

RDEPENDS:${PN} += "-python310-sqlalchemy >= 1.4 with python310-sqlalchemy < 2 \
python-abi"

inherit rpm
