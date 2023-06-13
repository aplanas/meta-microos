SUMMARY = "Pip requirement file parser"
DESCRIPTION = "A Pip requirement file parser."
LICENSE = "BSD-2-Clause"

PV = "0.2.0"

RPM_NAME = "python39-requirements-parser-0.2.0-6.1.noarch.rpm"
RPM_HASH = "f43e627004adcd194ef1a0580601e67633b8d17a10c3963be951d57a22770d44977b6cc7ca8959934a50201ecbcd544ab2e1af6237ec5dc7dc8df222bc58be0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(requirements-parser) \
python39-requirements-parser \
python3dist(requirements-parser)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
