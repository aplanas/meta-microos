SUMMARY = "Utility to check API integrity in python libraries"
DESCRIPTION = "Utility to check API integrity in Python libraries."
LICENSE = "MIT"

PV = "0.0.6"

RPM_NAME = "python310-pyux-0.0.6-1.15.noarch.rpm"
RPM_HASH = "f7f9e1689649a899afae5dde1eb64204d5639d1387618d7d12fe79895c978578abce9b977d46353443346a79510e7066cca7bf972dd58b8aada2587b6d6f8aae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyux \
python310-pyux \
python3dist-pyux"

RDEPENDS:${PN} += "python-abi"

inherit rpm
