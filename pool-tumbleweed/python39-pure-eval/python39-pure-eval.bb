SUMMARY = "Safely evaluate AST nodes without side effects"
DESCRIPTION = "Safely evaluate AST nodes without side effects"
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python39-pure-eval-0.2.2-2.3.noarch.rpm"
RPM_HASH = "9136a766f5c700b821ba3e2b43fb7853217b2b789d8a285d1e165f5eb9c3069fce663392459c573b5a4399aee28f1d6a9e436ba933a03b363dd4bf78568ae1a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pure-eval \
python39-pure-eval \
python3dist-pure-eval"

RDEPENDS:${PN} += "python-abi"

inherit rpm
