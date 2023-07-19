SUMMARY = "Extracts OS Browser etc information from http user agent string"
DESCRIPTION = "Extracts OS Browser etc information from http user agent string"
LICENSE = "MIT"

PV = "1.9.5"

RPM_NAME = "python310-httpagentparser-1.9.5-1.1.noarch.rpm"
RPM_HASH = "06fa3ea74dd53614a5d1898b2b4a0adb098b113c536aa8a915a4ffb6d73cc9419dea2e1d88205a06f6db2622f753db5b7c890f39445d5299cdebf7ecfb6da261"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-httpagentparser \
python310-httpagentparser \
python3dist-httpagentparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
