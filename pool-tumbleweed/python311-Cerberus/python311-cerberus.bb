SUMMARY = "Extensible schema and data validation tool for Python dictionaries"
DESCRIPTION = "Cerberus provides type checking and other base functionality out of the box and \
is designed to be non-blocking and extensible, allowing for custom \
validation."
LICENSE = "ISC"

PV = "1.3.2"

RPM_NAME = "python311-Cerberus-1.3.2-6.5.noarch.rpm"
RPM_HASH = "186369579f7f8e7c20e568069b9d95973e8d185795511498636f6a77b0d2898c20047a78b9fb993a9cca73e1b6a1fe1a31f5e9d41689fb2b0fae9cd7021fd3d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Cerberus \
python3.11dist-cerberus \
python311-Cerberus \
python3dist-cerberus"

RDEPENDS:${PN} += "python-abi"

inherit rpm
