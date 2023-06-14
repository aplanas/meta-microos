SUMMARY = "Extensible schema and data validation tool for Python dictionaries"
DESCRIPTION = "Cerberus provides type checking and other base functionality out of the box and \
is designed to be non-blocking and extensible, allowing for custom \
validation."
LICENSE = "ISC"

PV = "1.3.2"

RPM_NAME = "python311-Cerberus-1.3.2-6.3.noarch.rpm"
RPM_HASH = "3d50447e591896b5d37a8b6da6c27d38b2050453b56a3e56d48be73d57e477d19d56c57cd21996475631f0b23a34fcd7a2e82932361a420e3330382d13c0c5ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-cerberus \
python311-Cerberus \
python3dist-cerberus"

RDEPENDS:${PN} += "python-abi"

inherit rpm
