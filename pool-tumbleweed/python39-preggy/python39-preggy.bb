SUMMARY = "Assertion library for Python"
DESCRIPTION = "preggy is an assertion library for Python. (What were you ``expect()``ing?) \
Part of the pyVows test framework."
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "python39-preggy-1.4.4-2.12.noarch.rpm"
RPM_HASH = "40ed00fbd3862e2576bd5b6175a0ec42107088641fda080566831bd4c53dd17ce26ffb4b4af038aade4f426a4f3fa4c2cf3b148007c066db46c2a582ebd53fa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(preggy) \
python39-preggy \
python3dist(preggy)"

RDEPENDS:${PN} += "python(abi) \
python39-Unidecode \
python39-six"

inherit rpm
