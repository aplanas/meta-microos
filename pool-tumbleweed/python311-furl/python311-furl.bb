SUMMARY = "A Python URL manipulation library"
DESCRIPTION = "furl is a Python library for parsing and manipulating URLs."
LICENSE = "Unlicense"

PV = "2.1.3"

RPM_NAME = "python311-furl-2.1.3-3.1.noarch.rpm"
RPM_HASH = "2eec1b6185092e0b06c96a5db9c3daa1ccffef85e8f66c91517fde229b61a2f926eeb65acabdc421abdc22f1ad8182be048b7c2bc6b2d09a4cc2288d4eda7f48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-furl \
python3.11dist-furl \
python311-furl \
python3dist-furl"

RDEPENDS:${PN} += "python-abi \
python311-orderedmultidict \
python311-six"

inherit rpm
