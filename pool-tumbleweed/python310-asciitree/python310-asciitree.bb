SUMMARY = "Python module to draw ASCII trees"
DESCRIPTION = "ASCIItree draws tree structures using characters."
LICENSE = "MIT"

PV = "0.3.3"

RPM_NAME = "python310-asciitree-0.3.3-3.13.noarch.rpm"
RPM_HASH = "2aa85e0121439efe29c7e0f4c31649eb1e25fdbcac4655e025f8cf7d2ed96d2141192c5b3cec9fc295743c1466dda9073be1058c3b390c6e65dd585e8342edc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-asciitree \
python310-asciitree \
python3dist-asciitree"

RDEPENDS:${PN} += "python-abi"

inherit rpm
