SUMMARY = "Pip requirement file parser"
DESCRIPTION = "A Pip requirement file parser."
LICENSE = "BSD-2-Clause"

PV = "0.2.0"

RPM_NAME = "python311-requirements-parser-0.2.0-6.1.noarch.rpm"
RPM_HASH = "734c7687c04115965ad467f302d43058afc0052912e103fbf84c5695a5806a4006c03f325fad63558aa329674d5f532cd5527cb28ebd0ab98829ef0696b20536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-requirements-parser \
python311-requirements-parser \
python3dist-requirements-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
