SUMMARY = "Extensible schema and data validation tool for Python dictionaries"
DESCRIPTION = "Cerberus provides type checking and other base functionality out of the box and \
is designed to be non-blocking and extensible, allowing for custom \
validation."
LICENSE = "ISC"

PV = "1.3.5"

RPM_NAME = "python39-Cerberus-1.3.5-2.1.noarch.rpm"
RPM_HASH = "d77beb4ca6e742a8e4a5c2b2fd3209ddfbe5e8408c6cc737e0d06b05b7eaf1b1800d0fa70aade513619a2be7d17b2c592cc9869879437095cc4b8181ad027f40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cerberus \
python39-Cerberus \
python3dist-cerberus"

RDEPENDS:${PN} += "python-abi"

inherit rpm
