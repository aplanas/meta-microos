SUMMARY = "Package for physical quantities with units"
DESCRIPTION = "Support for physical quantities with units, based on numpy."
LICENSE = "BSD-3-Clause"

PV = "0.14.1"

RPM_NAME = "python39-quantities-0.14.1-1.3.noarch.rpm"
RPM_HASH = "703963db865dded18ef68959ae39f615556b9991f80b15427dbd0ea9c5cf9e968d1cd8a86bb5adc0853635deb6d1baa9d9c2d8423b1dbc0e1b8d1164d7bc0a8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-quantities \
python39-quantities \
python3dist-quantities"

RDEPENDS:${PN} += "python-abi \
python39-numpy"

inherit rpm
