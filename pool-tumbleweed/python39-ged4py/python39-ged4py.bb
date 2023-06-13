SUMMARY = "GEDCOM tools for Python"
DESCRIPTION = "GEDCOM tools for Python."
LICENSE = "MIT"

PV = "0.1.12"

RPM_NAME = "python39-ged4py-0.1.12-1.14.noarch.rpm"
RPM_HASH = "adca13474478fe7caefd99e4598c6d61a2f928748ead02ec9ddc6ff0f106cd6d0b77181bc372e027890988d70631ea902ee3c1eb037c78a60d503dd4ae97272e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ged4py) \
python39-ged4py \
python3dist(ged4py)"

RDEPENDS:${PN} += "python(abi) \
python39-ansel"

inherit rpm
