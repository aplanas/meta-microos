SUMMARY = "Pip requirement file parser"
DESCRIPTION = "A Pip requirement file parser."
LICENSE = "BSD-2-Clause"

PV = "0.2.0"

RPM_NAME = "python310-requirements-parser-0.2.0-6.1.noarch.rpm"
RPM_HASH = "af69cf8716062ca4789fa0fbc4a224036b45a4452183c5e6bb0e9a45ef8a95d95a2ca86548f533c11ab6c73a4d9830ac3da3f87c4e3a8cda9377da72f4c5fdf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requirements-parser \
python3.10dist(requirements-parser) \
python310-requirements-parser \
python3dist(requirements-parser)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
