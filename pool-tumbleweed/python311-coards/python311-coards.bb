SUMMARY = "A parser for COADS-compliant dates"
DESCRIPTION = "This module parses time values represented using the COARDS \
convention."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python311-coards-1.0.5-2.15.noarch.rpm"
RPM_HASH = "3622143816b41b1770223cbe1858adccf9a75dbee3198e668a3eb0e275bd3563ea7df7cc3e012772cc5399bde62ace4c7db668df1f87e446c86e7e13638d0c9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-coards \
python3.11dist-coards \
python311-coards \
python3dist-coards"

RDEPENDS:${PN} += "python-abi"

inherit rpm
