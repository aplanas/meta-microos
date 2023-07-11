SUMMARY = "GEDCOM tools for Python"
DESCRIPTION = "GEDCOM tools for Python."
LICENSE = "MIT"

PV = "0.1.12"

RPM_NAME = "python39-ged4py-0.1.12-1.16.noarch.rpm"
RPM_HASH = "9a0db88fe641adf50059ed5fc218cefe43926c67cd4ccd7f3afcaaf7f7b65114f9d115029196366f3eddeb0d65257fcfabe247bb9c303102b74b5b00442c3c4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ged4py \
python39-ged4py \
python3dist-ged4py"

RDEPENDS:${PN} += "python-abi \
python39-ansel"

inherit rpm
