SUMMARY = "Extensible schema and data validation tool for Python dictionaries"
DESCRIPTION = "Cerberus provides type checking and other base functionality out of the box and \
is designed to be non-blocking and extensible, allowing for custom \
validation."
LICENSE = "ISC"

PV = "1.3.5"

RPM_NAME = "python311-Cerberus-1.3.5-2.1.noarch.rpm"
RPM_HASH = "396b56aebbda97a517ad3543f7c3bf2208c78ca8e2bb15fa8c50a7261006fff02b6b0a1ac5e6a3658537492b7fedaf7ca359b199f071c1a563c13ad3a9c3ea1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Cerberus \
python3.11dist-cerberus \
python311-Cerberus \
python3dist-cerberus"

RDEPENDS:${PN} += "python-abi"

inherit rpm
