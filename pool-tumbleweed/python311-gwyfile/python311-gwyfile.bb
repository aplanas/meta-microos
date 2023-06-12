SUMMARY = "Pure Python implementation of the Gwyddion file format"
DESCRIPTION = "Pure Python implementation of the Gwyddion file format."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-gwyfile-0.2.0-2.9.noarch.rpm"
RPM_HASH = "cbda1f9d35c64d84ed23ceecb04cc781bcf006eb577017d9961ff61d0b5d6ce5a3e6a282cd78dc7840fe720b8fb4eb1b2db82a6696f3a6bf2c56dc6c39564e30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(gwyfile) \
python311-gwyfile \
python3dist(gwyfile)"
RDEPENDS:${PN} += "python(abi) \
python311-numpy \
python311-six"

inherit rpm
