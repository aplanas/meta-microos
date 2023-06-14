SUMMARY = "Extends the python-rich library functionality"
DESCRIPTION = "Extends the python-rich library functionality \
with a set of changes that were not accepted to rich itself."
LICENSE = "MIT"

PV = "1.2.7"

RPM_NAME = "python39-enrich-1.2.7-3.1.noarch.rpm"
RPM_HASH = "79eb4c4853c9159413b0a54f0521120b57a49ebc233fc050a0b660cc37940b54c58587f95e5d5ff27f79a332552d462ced0d6e7b9de1d71b6356259b1e352fcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-enrich \
python39-enrich \
python3dist-enrich"

RDEPENDS:${PN} += "python-abi \
python3.9dist-rich \
python39-rich"

inherit rpm
