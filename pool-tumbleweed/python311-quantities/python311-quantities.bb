SUMMARY = "Package for physical quantities with units"
DESCRIPTION = "Support for physical quantities with units, based on numpy."
LICENSE = "BSD-3-Clause"

PV = "0.14.1"

RPM_NAME = "python311-quantities-0.14.1-1.3.noarch.rpm"
RPM_HASH = "2c539bba4f77ccecd5f1c38d450edf180788a1ed27ea795936188b7e82749d4fd18476680e42598aed1f827608a55ea7d405d78e5c5c84d5902d46b7c76e43e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-quantities \
python3.11dist-quantities \
python311-quantities \
python3dist-quantities"

RDEPENDS:${PN} += "python-abi \
python311-numpy"

inherit rpm
