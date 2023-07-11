SUMMARY = "Extensible schema and data validation tool for Python dictionaries"
DESCRIPTION = "Cerberus provides type checking and other base functionality out of the box and \
is designed to be non-blocking and extensible, allowing for custom \
validation."
LICENSE = "ISC"

PV = "1.3.2"

RPM_NAME = "python310-Cerberus-1.3.2-6.5.noarch.rpm"
RPM_HASH = "b6e5c5323d9096fc98756f96f895954219946ce86d9f4c5c496ffcd2e0ce7156584d0373443d8dc9904d8a91e613f0a4814008bf6a6d01bd6f5f08dee7bc9593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cerberus \
python310-Cerberus \
python3dist-cerberus"

RDEPENDS:${PN} += "python-abi"

inherit rpm
