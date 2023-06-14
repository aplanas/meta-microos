SUMMARY = "Utility to check API integrity in python libraries"
DESCRIPTION = "Utility to check API integrity in Python libraries."
LICENSE = "MIT"

PV = "0.0.6"

RPM_NAME = "python39-pyux-0.0.6-1.14.noarch.rpm"
RPM_HASH = "c027af0615f27b8823f9bbe7247f3ca8501fb508842d0b1829c263cdd897c353f9d45d19d8864f62c18c1a861722fc7e7bc0d20c5fc9a58be368339603c37897"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyux \
python39-pyux \
python3dist-pyux"

RDEPENDS:${PN} += "python-abi"

inherit rpm
