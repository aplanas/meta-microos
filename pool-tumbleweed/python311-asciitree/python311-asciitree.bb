SUMMARY = "Python module to draw ASCII trees"
DESCRIPTION = "ASCIItree draws tree structures using characters."
LICENSE = "MIT"

PV = "0.3.3"

RPM_NAME = "python311-asciitree-0.3.3-3.13.noarch.rpm"
RPM_HASH = "aa044c07aeecfe8964f10caaffdfeed16c9fc870186034f5c3bcb3bd4a775de24c23ce19583bd1473868327f5f743a7c2267ce715eb16344413a8e11120eebb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asciitree \
python3.11dist-asciitree \
python311-asciitree \
python3dist-asciitree"

RDEPENDS:${PN} += "python-abi"

inherit rpm
