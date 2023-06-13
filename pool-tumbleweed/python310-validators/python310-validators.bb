SUMMARY = "Python Data Validation"
DESCRIPTION = "Python Data Validation for Humans."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python310-validators-0.20.0-3.1.noarch.rpm"
RPM_HASH = "f6ae2c546fa4597fe425364e1f5ccbc99a35c2510544efd2ad1132235a8307313b4f1469937b09e2699fa2098004ac2b9325748c895d370466744d4f278b70cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-validators \
python3.10dist(validators) \
python310-validators \
python3dist(validators)"

RDEPENDS:${PN} += "python(abi) \
python310-decorator"

inherit rpm
