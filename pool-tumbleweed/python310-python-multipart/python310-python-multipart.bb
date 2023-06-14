SUMMARY = "Python streaming multipart parser"
DESCRIPTION = "A streaming multipart parser for Python."
LICENSE = "Apache-2.0"

PV = "0.0.5"

RPM_NAME = "python310-python-multipart-0.0.5-5.3.noarch.rpm"
RPM_HASH = "3a2f626434444adbd0727eaef7fe3a0c56b7915fb20a1c512a60099882833ed102107ecd8b4cbb3b5d9a203034df9d4e2842c27c75d51b6b8f84a830b2a928ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-multipart \
python3.10dist-python-multipart \
python310-python-multipart \
python3dist-python-multipart"

RDEPENDS:${PN} += "python-abi"

inherit rpm
