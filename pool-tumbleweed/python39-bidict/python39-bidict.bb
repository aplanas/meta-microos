SUMMARY = "Bidirectional map implementation for Python"
DESCRIPTION = "Bidirectional map implementation and related functionality."
LICENSE = "MPL-2.0"

PV = "0.22.1"

RPM_NAME = "python39-bidict-0.22.1-1.3.noarch.rpm"
RPM_HASH = "c6d062301d76aa3d1da6e8caab36c5dc7c22088c88e5630e1526ab7b490b5c0b73ae9a95b4bb8b53715a64eb40bc22685a6ec04c6f83dfa9b122e33ac7fdcfd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bidict \
python39-bidict \
python3dist-bidict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
