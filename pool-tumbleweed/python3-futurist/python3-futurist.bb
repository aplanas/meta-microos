SUMMARY = "Useful additions to futures, from the future."
DESCRIPTION = "Useful additions to futures, from the future. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "2.4.1"

RPM_NAME = "python3-futurist-2.4.1-1.5.noarch.rpm"
RPM_HASH = "398e4c5127d36034766eda1298e60753111d864205882cb52216f1b7bce58c05af07c0fe3606ec141440a5300769a6e6023d9f530b25f33a76567bf372c2e43d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-futurist \
python3.10dist-futurist \
python3dist-futurist"

RDEPENDS:${PN} += "python-abi"

inherit rpm
