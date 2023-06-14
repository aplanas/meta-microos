SUMMARY = "A parser for COADS-compliant dates"
DESCRIPTION = "This module parses time values represented using the COARDS \
convention."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python39-coards-1.0.5-2.14.noarch.rpm"
RPM_HASH = "082db8f3aba3f05e4254f340be37ffce9cc70a610c396917b67d67832e36a56735a792ee5d9b9cbc3099c5b560131399ec54c37d26d31dd8f6caac888559c5f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-coards \
python39-coards \
python3dist-coards"

RDEPENDS:${PN} += "python-abi"

inherit rpm
