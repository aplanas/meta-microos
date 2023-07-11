SUMMARY = "URI Template Expansison"
DESCRIPTION = "This is a Python implementation of RFC6570, URI Template, and can expand \
templates up to and including Level 4 in that specification"
LICENSE = "Apache-2.0"

PV = "4.1.1"

RPM_NAME = "python310-uritemplate-4.1.1-3.1.noarch.rpm"
RPM_HASH = "f918badea2f47b8ab4e4cf4517accb6c9453c2430369f0cd17296acccd66c6ed946978cf8c4263c32a5edbc261ac33b5848f8837e1c0a91a5ffcb81808b3763e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-uritemplate \
python310-uritemplate \
python3dist-uritemplate"

RDEPENDS:${PN} += "python-abi"

inherit rpm
