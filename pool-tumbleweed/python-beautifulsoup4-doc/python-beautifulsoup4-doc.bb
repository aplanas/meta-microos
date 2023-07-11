SUMMARY = "Documentation for python-beautifulsoup4"
DESCRIPTION = "Documentation and help files for python-beautifulsoup4"
LICENSE = "MIT"

PV = "4.12.2"

RPM_NAME = "python-beautifulsoup4-doc-4.12.2-1.3.noarch.rpm"
RPM_HASH = "b6f4042c81dd26065ee1b856e46cf9e297dd223188e3811f30c9307b12d4269260192d74b71b174948c0cb22edf7ca96cbde6b32302cbd54a808dac41d78fec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-beautifulsoup4-doc"

RDEPENDS:${PN} += ""

inherit rpm
